package TallerJavaHitssBryanVirriel;

import java.util.Scanner;

public class restaurante {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double ventas = 0.0;
        int opcion;

        do {
            System.out.println("\n***** MENÚ DEL CAJERO *****");
            System.out.println("1. Registrar un pedido");
            System.out.println("2. Mostrar el total de ventas");
            System.out.println("3. Salir del sistema");
            System.out.print("Seleccione una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Ingrese un número válido: ");
                scanner.next();
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el precio del pedido: $");
                    while (!scanner.hasNextDouble()) {
                        System.out.print("Ingrese un número válido: $");
                        scanner.next();
                    }
                    double precio = scanner.nextDouble();
                    if (precio > 0) {
                        ventas += precio;
                        System.out.printf("Pedido registrado. Total acumulado: $%.2f\n", ventas);
                    } else {
                        System.out.println("El precio debe ser un número positivo.");
                    }
                }
                case 2 -> System.out.printf("Total de ventas: $%.2f\n", ventas);
                case 3 -> System.out.println("Saliendo del sistema.");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}
