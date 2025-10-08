import java.util.*;

public class Inventario {
    private Map<String, Producto> productosPorSKU;     // Consulta rápida por SKU
    private List<String> ordenInsercion;               // Guardamos el orden en que se agregaron

    public Inventario() {
        productosPorSKU = new HashMap<>();
        ordenInsercion = new ArrayList<>();
    }

    // 1. Registrar producto
    public void registrarProducto(Producto producto) {
        String sku = producto.getSku();
        if (!productosPorSKU.containsKey(sku)) {
            productosPorSKU.put(sku, producto);
            ordenInsercion.add(sku);
        } else {
            System.out.println("Producto con SKU ya existente.");
        }
    }

    // 2. Consultar por SKU (O(1))
    public Producto consultarPorSKU(String sku) {
        return productosPorSKU.get(sku);
    }

    // 3. Reporte por orden de inserción
    public void reportePorInsercion() {
        System.out.println("Reporte en orden de inserción:");
        for (String sku : ordenInsercion) {
            System.out.println(productosPorSKU.get(sku));
        }
    }

    // 4. Reporte ordenado alfabéticamente por nombre
    public void reportePorNombre() {
        System.out.println("Reporte ordenado alfabéticamente:");
        List<Producto> productos = new ArrayList<>(productosPorSKU.values());

        productos.sort(Comparator.comparing(Producto::getNombre)); // Orden alfabético

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    // 5. Actualizar stock
    public void actualizarStock(String sku, int nuevoStock) {
        Producto producto = productosPorSKU.get(sku);
        if (producto != null) {
            producto.setStock(nuevoStock);
            System.out.println("Stock actualizado: " + producto);
        } else {
            System.out.println("Producto no encontrado con SKU: " + sku);
        }
    }
}