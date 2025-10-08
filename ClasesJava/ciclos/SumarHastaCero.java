package ciclos;

import java.util.Scanner;

public class SumarHastaCero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int suma = 0, numero;
        System.out.println("Ingresa el numero: ");
        numero = entrada.nextInt();
        while (numero != 0) {
            suma += numero; //suma = suma + numero
            System.out.println("Ingrese el numero: ");
            numero = entrada.nextInt();
        }

        System.out.println("Suma total: " + suma);
        entrada.close();
    }
}
