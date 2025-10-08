import java.util.Scanner;

public class RegistroAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[3];
        int contador = 0;

        while (true) {
            try {
                System.out.print("Ingrese el nombre del alumno: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la edad del alumno: ");
                int edad = Integer.parseInt(scanner.nextLine()); // Puede lanzar NumberFormatException

                // Crear y guardar alumno
                alumnos[contador] = new Alumno(nombre, edad);
                System.out.println("Alumno registrado exitosamente.");
                contador++;

                if (contador >= alumnos.length) {
                    System.out.println("\nSe han registrado todos los alumnos.");
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: La edad debe ser un número válido.");
            } catch (IllegalArgumentException | EdadInvalidaException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: No se pueden registrar más de 3 alumnos.");
                break;
            }
        }

        // Mostrar alumnos registrados
        System.out.println("\n--- Lista de alumnos registrados ---");
        for (Alumno a : alumnos) {
            if (a != null) {
                System.out.println(a);
            }
        }
    }
}