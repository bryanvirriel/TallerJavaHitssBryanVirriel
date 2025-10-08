//Leer 10 numeros enteros desde el teclado para llenar un arreglo de 10 elementos. Luego debemos mostrarlos en el siguiente orden:
//el ultimo, el primero, el penultimo, el segundo, el antepenultimo, el tercero y asi sucesivamente
package arreglos;

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[10];

        System.out.println("Ingresa 10 números enteros: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numero[i] = sc.nextInt();
        }
        int[] orden = new int[10];
        int izquierda = 0;
        int derecha = numero.length - 1;
        int indice = 0;

        while (izquierda <= derecha) {
            if (indice < numero.length) {
                orden[indice++] = numero[derecha--]; 
            }
            if (indice < numero.length) {
                orden[indice++] = numero[izquierda++]; 
            }
        }
        System.out.println("\nNúmeros en el orden solicitado:");
        for (int i = 0; i < orden.length; i++) {
            System.out.print(orden[i] + " ");
        }
        sc.close();
    }
}
