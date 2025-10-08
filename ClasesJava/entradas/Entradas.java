package entradas;

import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int edad;
        String nombre; 
        long telefono;
        double estatura;
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Edad: ");
        edad = entrada.nextInt();
        System.out.println("Telefono: ");
        telefono = entrada.nextLong();
        System.out.println("Estatura: ");
        estatura = entrada.nextDouble();
        System.out.println("Hola, " + nombre + ", tienes " + edad + " años ");
        System.out.println("Telefono: " + telefono);
        System.out.println("Estatura: " + estatura);
        entrada.close();
    }
    
}
