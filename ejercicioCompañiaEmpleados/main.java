public class main {
    public static void main(String[] args) {
        gerente gerente = new gerente("Bryan", "Virriel", "F123456", "Av. mexico",
                                      50000, 101, 200000);

        // Aumentamos remuneración
        gerente.aumentarRemuneracion(10); // +10%

        // Imprimir datos completos
        System.out.println(gerente.toString());
    }
}
