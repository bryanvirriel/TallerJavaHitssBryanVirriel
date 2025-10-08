package Ejercicios;

import java.util.Scanner;
public class EjercicioFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Ingrese la cantidad de números a comparar (mínimo 10): ");
        int cantidadNumeros = scanner.nextInt();
 
        // Validar que la cantidad sea al menos 10
        if (cantidadNumeros < 10) {
            System.out.println("La cantidad de números debe ser al menos 10.");
            scanner.close();
            return;
        }
 
        int numeroMenor = Integer.MAX_VALUE; // Inicializar con el valor máximo posible
 
        System.out.println("Ingrese los números:");
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }
 
        System.out.println("El número menor es: " + numeroMenor);
 
        if (numeroMenor < 10) {
            System.out.println("El número menor es menor que 10");
        } else {
            System.out.println("El número es menor o igual que 10");
        }
 
        scanner.close();
    }
}