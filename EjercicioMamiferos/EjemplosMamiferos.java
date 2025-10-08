public class EjemplosMamiferos {
    public static void main(String[] args) {
        mamiferos[] mamiferos = new mamiferos[6];

        mamiferos[0] = new leon("Sabana", 1.2f, 2.4f, 190f, "Leon", 5.5f, 80, 10, 114.2f);
        mamiferos[1] = new tigre("Selva", 1.1f, 2.5f, 220f, "Tigre", 6.0f, 65, "Tigre de Bengala");
        mamiferos[2] = new guepardo("Sabanas africanas", 0.9f, 1.5f, 72f, "Guepardo", 4.8f, 112);
        mamiferos[3] = new lobo("Bosques", 0.8f, 1.6f, 50f, "Lobo", "gris", 3.5f, 4, "Lobo ibérico");
        mamiferos[4] = new perro("Sabana", 0.75f, 1.4f, 40f, "Perro", "moteado", 2.8f, 317);
        
        for (mamiferos animal : mamiferos) {
            System.out.println("==== " + animal.getNombreCientifico() + " ====");
            System.out.println("Hábitat: " + animal.getHabitat());
            System.out.println("Altura: " + animal.getAltura() + " m");
            System.out.println("Largo: " + animal.getLargo() + " m");
            System.out.println("Peso: " + animal.getPeso() + " kg");
            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
            System.out.println();
        }
    }
}
