import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = 0;
        int absNum2 = Math.abs(num2);
        
        for (int i = 0; i < absNum2; i++) {
            if (num2 > 0) {
                resultado += num1;
            } else {
                resultado -= num1;
            }
        }

        
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            resultado = -resultado;
        }
         System.out.println("El resultado de la multiplicación es: " + resultado);
        
        scanner.close();


        System.out.println(" -> ");
    }
}