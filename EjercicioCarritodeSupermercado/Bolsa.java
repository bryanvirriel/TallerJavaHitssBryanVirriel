import java.util.ArrayList;

public class Bolsa<T extends Producto> {
    private ArrayList<T> productos;

    public Bolsa() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(T producto) {
        if (productos.size() < 5) {
            productos.add(producto);
        } else {
            System.out.println("La bolsa ya contiene 5 productos.");
        }
    }

    public void mostrarProductos() {
        for (T producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + ", Precio: " + producto.getPrecio());

            // Detectamos el tipo y accedemos sin cast
            if (producto instanceof Lacteo l) {
                System.out.println("Cantidad: " + l.getCantidad() + ", Proteínas: " + l.getProteinas());
            } else if (producto instanceof Fruta f) {
                System.out.println("Peso: " + f.getPeso() + ", Color: " + f.getColor());
            } else if (producto instanceof Limpieza l) {
                System.out.println("Componentes: " + l.getComponentes() + ", Litros: " + l.getLitros());
            } else if (producto instanceof NoPerecible np) {
                System.out.println("Contenido: " + np.getContenido() + ", Calorías: " + np.getCalorias());
            }

            System.out.println("--------------------------");
        }
    }
}