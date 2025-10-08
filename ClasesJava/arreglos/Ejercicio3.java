package arreglos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = console.nextInt();

        if (n == 0) {
            System.out.println("ERROR");
            return;
        }
        for (int fila = 0; fila < n; fila++) {
            for (int columna = 0; columna < n; columna++) {
                if (columna == fila || columna == (n - 1 - fila)) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println(); 
        }
    }
}
