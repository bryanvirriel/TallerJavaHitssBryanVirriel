import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Lambda que encuentra la palabra más repetida en una frase
        Function<String, Map<String, Integer>> palabraMasRepetida = frase -> {
            String[] palabras = frase.toLowerCase().replaceAll("[^a-záéíóúüñ\\s]", "").split("\\s+");
            Map<String, Integer> conteo = new HashMap<>();

            for (String palabra : palabras) {
                if (!palabra.isBlank()) {
                    conteo.put(palabra, conteo.getOrDefault(palabra, 0) + 1);
                }
            }

            String palabraMax = "";
            int maxRepeticiones = 0;

            for (Map.Entry<String, Integer> entry : conteo.entrySet()) {
                if (entry.getValue() > maxRepeticiones) {
                    palabraMax = entry.getKey();
                    maxRepeticiones = entry.getValue();
                }
            }

            // Resultado con solo la palabra más repetida
            Map<String, Integer> resultado = new HashMap<>();
            if (!palabraMax.isEmpty()) {
                resultado.put(palabraMax, maxRepeticiones);
            }

            return resultado;
        };

        String frase = "Hola mundo hola mundo hola prueba prueba.";
        Map<String, Integer> resultado = palabraMasRepetida.apply(frase);

        resultado.forEach((palabra, cantidad) ->
            System.out.println("Palabra más repetida: \"" + palabra + "\" aparece " + cantidad + " veces.")
        );
    }
}