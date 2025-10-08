import java.text.SimpleDateFormat;
import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Producto[] productos = new Producto[5];

        productos[0] = new IPhone(13000, "Apple 14");
        productos[1] = new TVLed(70000, "Samsung");
        productos[2] = new LibroTecnico(500, sdf.parse("10/09/2020"), "Eric Gamma", "Elementos reutilizables POO", "Alguna...");
        productos[3] = new Comic(140, sdf.parse("15/05/2018"), "Martin Fowler", "UML Gotas a Gotas", "Alguna...");
        productos[4] = new Comic(160, sdf.parse("01/01/2021"), "Stan Lee", "Spiderman", "Marvel");

        for (Producto producto : productos) {
            System.out.println("------------------------------------");
            System.out.println("Tipo: " + producto.getClass().getSimpleName());
            System.out.println("Precio base: " + producto.getPrecio());
            System.out.println("Precio venta: " + producto.getPrecioVenta());
        }
    }
}