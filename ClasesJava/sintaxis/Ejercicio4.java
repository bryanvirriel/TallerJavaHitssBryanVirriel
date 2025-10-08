import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("********* Menú de Administración de Productos ********");
            System.out.println("1. Actualizar");
            System.out.println("2. Eliminar");
            System.out.println("3. Crear");
            System.out.println("4. Listar");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción (1-5): ");
            opcion = consola.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Usuario actualizado correctamente\n");
                    break;
                case 2:
                    System.out.println("Usuario eliminado correctamente\n");
                    break;
                case 3:
                    System.out.println("Usuario creado correctamente\n");
                    break;
                case 4:
                    System.out.println("Listado de usuarios\n");
                    break;
                case 5:
                    System.out.println("¡Haz salido con éxito!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.\n");
            }
        } while (opcion != 5);  
        consola.close();
    }
}