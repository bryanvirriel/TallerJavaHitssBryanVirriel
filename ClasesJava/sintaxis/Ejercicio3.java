import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notasMayores = 0;
        double notasMenores = 0;
        double sumaTotal = 0;

        int cantidadMayores = 0;
        int cantidadMenores = 0;
        int notasIguales = 0;

        int totalNotas = 20;

        for (int i = 0; i < totalNotas; i++) {
            double nota = -1;
            while (true) {
                System.out.print("Ingrese la nota del alumno " + (i + 1) + " (entre 1 y 10): ");
                nota = scanner.nextDouble();

                if (nota == 0) {
                    System.out.println("Error: se ingresó 0. Terminando el programa.");
                    return;
                }
                if (nota > 10) {
                    System.out.println("Error: nota mayor a 10. Terminando el programa.");
                    return;
                }
                if (nota < 1) {
                    System.out.println("Nota inválida. Intente nuevamente.");
                    continue;
                }
                break;
            }
            sumaTotal += nota;

            if (nota >= 6) {
                notasMayores += nota;
                cantidadMayores++;
            } else {
                notasMenores += nota;
                cantidadMenores++;
            }

            if (nota == 1) {
                notasIguales++;
            }
        }
        double promedioMayores = (cantidadMayores > 0) ? notasMayores / cantidadMayores : 0;
        double promedioMenores = (cantidadMenores > 0) ? notasMenores / cantidadMenores : 0;
        double promedioTotal = sumaTotal / totalNotas;

        System.out.println("\n--- Resultados ---");
        System.out.println("Promedio de notas mayores : " + promedioMayores);
        System.out.println("Promedio de notas menores : " + promedioMenores);
        System.out.println("Cantidad iguales a 1: " + notasIguales);
        System.out.println("Promedio total: " + promedioTotal);

        scanner.close();
    }
}