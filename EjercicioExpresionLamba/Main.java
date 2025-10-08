import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        
        Function<String, String> limpiarYMayusculas = frase ->
        frase.replaceAll("[\\s,.]", "").toUpperCase();

        String fraseOriginal = "Taller, Java. Programacion y ejercicio.";
        String resultado = limpiarYMayusculas.apply(fraseOriginal);

        System.out.println("Resultado: " + resultado);
    }
}