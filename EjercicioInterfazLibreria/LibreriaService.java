import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class LibreriaService {
    private List<Libro> libros = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Venta> ventas = new ArrayList<>();

    public void agregarLibro(Libro libro, Validador<Libro> validador) {
        if (validador.validar(libro)) {
            libros.add(libro);
        } else {
            System.out.println("Libro no válido: " + libro.titulo);
        }
    }

    public void agregarCliente(Cliente cliente, Validador<Cliente> validador) {
        if (validador.validar(cliente)) {
            clientes.add(cliente);
        } else {
            System.out.println("Cliente no válido: " + cliente.nombre);
        }
    }

    public void registrarVenta(Cliente cliente, Libro libro, Accion<Venta> accion) {
        Venta venta = new Venta(cliente, libro, LocalDate.now());
        ventas.add(venta);
        accion.ejecutar(venta);
    }

    public List<String> generarResumenes(Transformador<Libro, String> transformador) {
        return libros.stream().map(transformador::transformar).collect(Collectors.toList());
    }

    public String generarIdLibro(Generador<String> generador) {
        return generador.generar();
    }

    public double calcularPromedioPrecio(Calculador<Libro, Double> calculador) {
        return calculador.calcular(libros);
    }

    public Optional<Libro> libroMasCaro() {
        return libros.stream().max(Comparator.comparingDouble(l -> l.precio));
    }

    public Optional<Libro> libroMasBarato() {
        return libros.stream().min(Comparator.comparingDouble(l -> l.precio));
    }
}