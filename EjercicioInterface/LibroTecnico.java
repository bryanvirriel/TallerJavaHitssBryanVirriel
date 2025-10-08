import java.util.Date;

public class LibroTecnico extends LibroImpl {
    public LibroTecnico(double precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
    }

    @Override
    public double getPrecioVenta() {
        return precio * 1.15; // 15% más
    }
}