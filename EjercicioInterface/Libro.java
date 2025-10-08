public interface Libro extends Producto {
    java.util.Date getFechaPublicacion();
    String getAutor();
    String getTitulo();
    String getEditorial();
}