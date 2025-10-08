public class Main {
    public static void main(String[] args) {
        Bolsa<Lacteo> bolsaLacteos = new Bolsa<>();
        bolsaLacteos.agregarProducto(new Lacteo("Leche", 1.5, 1000, 8));
        bolsaLacteos.agregarProducto(new Lacteo("Yogurt", 0.99, 200, 5));
        bolsaLacteos.agregarProducto(new Lacteo("Queso", 2.5, 500, 12));
        bolsaLacteos.agregarProducto(new Lacteo("Crema", 1.75, 250, 10));
        bolsaLacteos.agregarProducto(new Lacteo("Mantequilla", 3.0, 300, 15));

        bolsaLacteos.mostrarProductos();


    }
}