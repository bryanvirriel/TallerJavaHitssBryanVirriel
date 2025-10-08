package Ejercicios;
import java.util.Scanner;

public class Ejercicio2Buclefor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad;

        do {
            System.out.print("Ingresa la cantidad de números (mínimo 10): ");
            cantidad = scanner.nextInt();
        } while (cantidad < 10);

        int numeroMenor = Integer.MAX_VALUE;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número #" + i + ": ");
            int numero = scanner.nextInt();

            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }
        
        System.out.println("El número menor es: " + numeroMenor);

        // Verificar si es menor que 10
        if (numeroMenor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }

        scanner.close();
    }
}

