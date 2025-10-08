public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.registrarProducto(new Producto("SKU001", "Balón de fútbol", "Fútbol", 100));
        inventario.registrarProducto(new Producto("SKU002", "Camiseta running", "Running", 50));
        inventario.registrarProducto(new Producto("SKU003", "Raqueta de tenis", "Tenis", 30));

        // Consulta por SKU
        System.out.println("" +
                "Consulta SKU002:");
        System.out.println(inventario.consultarPorSKU("SKU002"));

        // Reporte en orden de inserción
        inventario.reportePorInsercion();

        // Reporte alfabético
        inventario.reportePorNombre();

        // Actualización de stock
        inventario.actualizarStock("SKU003", 60);
    }
}