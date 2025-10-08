import java.util.Date;

public class Comic extends LibroImpl {
    public Comic(double precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
    }

    @Override
    public double getPrecioVenta() {
        return precio * 1.10; // 10% más
    }
}