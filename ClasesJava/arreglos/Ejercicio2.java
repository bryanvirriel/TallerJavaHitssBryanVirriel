package arreglos;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        int[] elementos = new int[10];
        Random rand = new Random();

        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = rand.nextInt(9) + 1; 
        }
        
        System.out.println("Elementos: " + Arrays.toString(elementos));
        Map<Integer, Integer> conteo = new HashMap<>();

        for (int num : elementos) {
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }

        int repetido = elementos[0];
        int max = 0;

        for (Map.Entry<Integer, Integer> entry : conteo.entrySet()) {
            if (entry.getValue() > max) {
                repetido = entry.getKey();
                max = entry.getValue();
            }
        }

        System.out.println("1. La mayor ocurrencia es: " + max);
        System.out.println("2. El elemento que más se repite es: " + repetido);
        System.out.println("En el arreglo, el número " + repetido + " se repite " + max + " veces.");
    }
}