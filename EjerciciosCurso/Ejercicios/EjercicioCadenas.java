package Ejercicios;
import java.util.Scanner;

public class EjercicioCadenas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre1,nombre2,nombre3,nuevoNombre1,nuevoNombre2,nuevoNombre3;

        System.out.println("Nombre 1: ");
        nombre1 = entrada.nextLine();
        System.out.println("Nombre 2: ");
        nombre2 = entrada.nextLine();
        System.out.println("Nombre 3: ");
        nombre3 = entrada.nextLine();

        nuevoNombre1 = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length() - 2);
        nuevoNombre2 = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length() - 2);
        nuevoNombre3 = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length() - 2);

        System.out.println("Resultado: " + nuevoNombre1 + "_" + nuevoNombre2 + "_" + nuevoNombre3);
    }
}
