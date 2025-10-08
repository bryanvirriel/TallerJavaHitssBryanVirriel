package arreglos;

import java.util.Arrays;

public class MetodosArreglo {
public static void main(String[] args) {
    int[] edades = {34, 20, 15, 34, 43, 38, 19, 27, 60, 10};
    for(int edad : edades){
        System.out.println(edad);
    }
    System.out.println("Busque: " + Arrays.binarySearch(edades,10));
    Arrays.sort(edades);
    System.out.println("Arreglo ordenad de menor a mayor: ");
    for (int edad : edades) {
        System.out.println(edad); 
    }
}
}