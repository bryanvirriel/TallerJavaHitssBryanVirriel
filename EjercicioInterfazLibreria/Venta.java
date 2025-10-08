import java.time.LocalDate;

public class Venta {
    Cliente cliente;
    Libro libro;
    LocalDate fecha;

    public Venta(Cliente cliente, Libro libro, LocalDate fecha) {
        this.cliente = cliente;
        this.libro = libro;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta: " + libro.titulo + " a " + cliente.nombre + " en " + fecha;
    }
}