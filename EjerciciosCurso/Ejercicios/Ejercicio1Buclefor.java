package Ejercicios;
import java.util.Scanner;

public class Ejercicio1Buclefor {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el primer número: ");
    int num1 = scanner.nextInt();
    System.out.print("Ingresa el segundo número: ");
    int num2 = scanner.nextInt();

    
    boolean resultadoNegativo = false;
    if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
    resultadoNegativo = true;
    }

    int a = num1 < 0 ? -num1 : num1;
    int b = num2 < 0 ? -num2 : num2;

    int resultado = 0;

    for (int i = 0; i < b; i++) {
            resultado += a;
        }

    if (resultadoNegativo) {
            resultado = -resultado;
    }
        System.out.println("El resultado es: " + resultado);
    }
}