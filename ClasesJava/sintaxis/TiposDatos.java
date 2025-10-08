public class TiposDatos {
    static String nombre;
    static int edad;
    static boolean esValido;
    public static void main(String[] args) {
        int edad = 20;
        System.out.println("Edad: " + edad);
        //TiposDatos objeto = new TiposDatos():
        //objeto.saludar();
        saludar();
    }

    public static void saludar() {
        nombre = "Eloy"; 
        System.out.println("Edad con metodo: " + edad);
        System.out.println("Nombre: " + nombre);
        System.out.println("Es vaido: " + esValido);
        
    }
} 