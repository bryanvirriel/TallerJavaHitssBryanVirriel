import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class SistemaSupermercado {


    static class Producto {
        int id;
        String nombre;
        double precio;
        int stock;

        public Producto(int id, String nombre, double precio, int stock) {
            this.id = id;
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        @Override
        public String toString() {
            return nombre + " - $" + precio + " (Stock: " + stock + ")";
        }
    }

    static class Cliente {
        int id;
        String nombre;
        String tipo; // "Normal" o "VIP"

        public Cliente(int id, String nombre, String tipo) {
            this.id = id;
            this.nombre = nombre;
            this.tipo = tipo;
        }
    }

    static class Empleado {
        int id;
        String nombre;
        String puesto;

        public Empleado(int id, String nombre, String puesto) {
            this.id = id;
            this.nombre = nombre;
            this.puesto = puesto;
        }
    }

    static class Venta {
        int id;
        Cliente cliente;
        Empleado empleado;
        List<Producto> productos;
        double total;

        public Venta(int id, Cliente cliente, Empleado empleado, List<Producto> productos) {
            this.id = id;
            this.cliente = cliente;
            this.empleado = empleado;
            this.productos = (productos != null) ? productos : new ArrayList<>();
            this.total = this.productos.stream().mapToDouble(p -> p.precio).sum();
        }

        @Override
        public String toString() {
            return "Venta #" + id + " - Cliente: " + cliente.nombre + " - Total: $" + total;
        }
    }

    public static void main(String[] args) {

        // Productos disponibles
        List<Producto> productos = Arrays.asList(
            new Producto(1, "Pan", 1.5, 2),
            new Producto(2, "Leche", 390.0, 10),
            new Producto(3, "Huevos", 400.0, 3),
            new Producto(4, "Queso", 430.5, 6)
        );

        // Cliente y Empleado
        Cliente cliente = new Cliente(1, "Ana", "VIP");
        Empleado empleado = new Empleado(1, "Carlos", "Cajero");

        // 1. Filtrar productos con stock < 5
        Predicate<Producto> stockBajo = p -> p.stock < 5;
        List<Producto> stockBajoList = productos.stream().filter(stockBajo).collect(Collectors.toList());
        stockBajoList.forEach(p -> System.out.println("Stock bajo: " + p));

        // 2. Calcular total
        Function<List<Producto>, Double> calcularTotal = lista -> lista.stream().mapToDouble(p -> p.precio).sum();
        double total = calcularTotal.apply(productos);
        System.out.println("Total compra: $" + total);

        // 3. Imprimir productos
        Consumer<List<Producto>> imprimirProductos = lista -> {
            System.out.println("\nLista de productos:");
            lista.forEach(System.out::println);
        };
        imprimirProductos.accept(productos);

        // 4. Producto de muestra
        Supplier<Producto> productoDemo = () -> new Producto(0, "Demo", 0.0, 0);
        System.out.println("\nProducto demo: " + productoDemo.get());

        // 5. Aplicar 10% de descuento
        Function<Producto, Producto> aplicarDescuento = p ->
                new Producto(p.id, p.nombre, p.precio * 0.9, p.stock);
        List<Producto> conDescuento = productos.stream().map(aplicarDescuento).collect(Collectors.toList());
        System.out.println("\nProductos con 10% de descuento:");
        conDescuento.forEach(System.out::println);

        // 6. Ordenar por precio descendente
        List<Producto> ordenados = productos.stream()
                .sorted((p1, p2) -> Double.compare(p2.precio, p1.precio))
                .collect(Collectors.toList());
        System.out.println("\nProductos ordenados (precio descendente):");
        ordenados.forEach(System.out::println);

       // 7. Verificar si aplica descuento especial y aplicar si corresponde
        double totalSinDescuento = productos.stream().mapToDouble(p -> p.precio).sum();

        BiPredicate<Cliente, Double> descuentoEspecial = (c, t) ->
        c.tipo.equalsIgnoreCase("VIP") && t > 1000;

        //BiPredicate<Cliente, Double> descuentoEspecial = (c, t) ->
        //c.tipo.equalsIgnoreCase("VIP");

        List<Producto> productosFinales = productos;

        if (descuentoEspecial.test(cliente, totalSinDescuento)) {
        productosFinales = productos.stream()
            .map(p -> new Producto(p.id, p.nombre, p.precio * 0.9, p.stock))
            .collect(Collectors.toList());
        System.out.println("Se aplicó descuento especial del 10% por ser cliente VIP y compra > 1000.");
        } else {
        System.out.println("No se aplicó descuento especial.");
        

        // 8. Crear venta con productos (con o sin descuento)
        Venta venta = new Venta(1, cliente, empleado, productosFinales);
        System.out.println("\n" + venta);

        // 9. Notificar cliente
        Consumer<Cliente> notificarCliente = c ->
                System.out.println("Notificación enviada a: " + c.nombre);
        notificarCliente.accept(cliente);
    }
}
}