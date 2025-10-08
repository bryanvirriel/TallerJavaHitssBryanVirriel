public class Libro {
    String titulo;
    String autor;
    int anioPublicacion;
    double precio;

    public Libro(String titulo, String autor, int anioPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + anioPublicacion + ") - $" + precio;
    }
}