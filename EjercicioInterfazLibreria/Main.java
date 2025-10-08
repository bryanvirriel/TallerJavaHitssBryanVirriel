import java.util.*;

public class Main {
    public static void main(String[] args) {
        LibreriaService servicio = new LibreriaService();

        // Validadores
        Validador<Libro> validadorLibro = l -> l.anioPublicacion > 1900;
        Validador<Cliente> validadorCliente = c -> c.edad >= 18;

        // Crear libros y clientes
        Libro libro1 = new Libro("Java Básico", "Juan Pérez", 2015, 55.5);
        Libro libro2 = new Libro("Ciencias Antiguas", "Ana Díaz", 1895, 40.0); // No válido

        Cliente cliente1 = new Cliente("Laura", 22);

        // Agregar datos
        servicio.agregarLibro(libro1, validadorLibro);
        servicio.agregarLibro(libro2, validadorLibro); // Rechazado
        servicio.agregarCliente(cliente1, validadorCliente);

        // Venta con acción
        servicio.registrarVenta(cliente1, libro1, venta ->
            System.out.println("Venta realizada: " + venta)
        );

        // Transformar libros en resumen
        List<String> resumenes = servicio.generarResumenes(libro ->
            libro.titulo + " por " + libro.autor + " ($" + libro.precio + ")"
        );
        resumenes.forEach(System.out::println);

        // Generar ID de libro
        String id = servicio.generarIdLibro(() -> UUID.randomUUID().toString());
        System.out.println("ID generado: " + id);

        // Calcular promedio de precios
        double promedio = servicio.calcularPromedioPrecio(lista ->
            lista.stream().mapToDouble(l -> l.precio).average().orElse(0.0)
        );
        System.out.println("Promedio de precios: $" + promedio);

        // Libros más caro/barato
        servicio.libroMasCaro().ifPresent(libro ->
            System.out.println("Libro más caro: " + libro.titulo)
        );
        servicio.libroMasBarato().ifPresent(libro ->
            System.out.println("Libro más barato: " + libro.titulo)
        );
    }
}