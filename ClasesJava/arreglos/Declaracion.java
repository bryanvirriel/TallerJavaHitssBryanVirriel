package arreglos;

import java.util.Arrays;

public class Declaracion {
    public static void main(String[] args) {
        //Declaracion de un arreglo
        //tipo[] nombreArreglo
        int [] numeros; //Declaracion
        numeros = new int[10]; //Inicializacion

        final int N = 10;
        String[] nombres = new String[N]; //Declaracion e inicializa el arreglo

        //Declarar e inicializar directamente con valores el arreglo
        char[] letras = {'a','b','c','d','e'};

        int edades[] = new int[10];

        String nombre = "Eloy";
        System.out.println("Tamano de nombre: " + nombre.length());
        System.out.println("Tamaño arreglo: "+ numeros.length);
        
        /*numeros[0] = 10;
        //numeros[1] = 20;
        //numeros[9] = 100;
        int valor = 10;
        for (int i = 0; i < edades.length; i++) {
            numeros[i] = valor;
            valor += ;
        }*/

        System.out.println("Ultimo elemento: " + numeros[numeros.length - 1]);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + ":" + numeros[i]);
        }

        //for-each
        for(int numero : numeros) {
            System.out.println(numero);
        }

        for (int j = 0; j < letras.length; j++) {
            System.out.println("Letra: " + letras[j]); 
        }    
    }
}
