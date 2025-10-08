
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class ProyectoVuelo {
    public static void main(String[] args) {
        List<Vuelo> vuelos = new ArrayList<>();

        // Cargar vuelos manualmente (según la imagen)
        vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", LocalDate.of(2021, 8, 31), LocalTime.of(15, 15), 51));
        vuelos.add(new Vuelo("AAL 993", "New York", "Santiago", LocalDate.of(2021, 8, 29), LocalTime.of(6, 45), 49));
        vuelos.add(new Vuelo("GOL 7662", "Sao Paulo", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(10, 55), 39));
        vuelos.add(new Vuelo("AZU 8471", "Rio De Janeiro", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(14, 10), 29));
        vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(18, 45), 39));
        vuelos.add(new Vuelo("KLM 702", "Amsterdam", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(19, 5), 31));
        vuelos.add(new Vuelo("AMX 401", "Mexico City", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(19, 45), 45));
        vuelos.add(new Vuelo("IBE 6833", "Madrid", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(20, 5), 60));
        vuelos.add(new Vuelo("LAT 705", "Londres", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(20, 10), 51));
        vuelos.add(new Vuelo("AFR 406", "Paris", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(20, 20), 55));
        vuelos.add(new Vuelo("LAT 247", "Los Angeles", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(21, 0), 59));
        vuelos.add(new Vuelo("IBE 6833", "Madrid", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(21, 30), 60));
        vuelos.add(new Vuelo("LAT 743", "Lima", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(22, 15), 35));
        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(23, 25), 31));
        vuelos.add(new Vuelo("LAT 241", "Bogota", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(23, 50), 25));
        vuelos.add(new Vuelo("LAT 1283", "Miami", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(23, 55), 61));
        vuelos.add(new Vuelo("AAL 957", "Dallas-Fort Worth", "Santiago", LocalDate.of(2021, 8, 31), LocalTime.of(6, 30), 62));
        vuelos.add(new Vuelo("BAW 251", "Londres", "Santiago", LocalDate.of(2021, 8, 31), LocalTime.of(9, 0), 52));
        vuelos.add(new Vuelo("LAT 501", "Paris", "Santiago", LocalDate.of(2021, 8, 31), LocalTime.of(9, 45), 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", LocalDate.of(2021, 8, 30), LocalTime.of(15, 45), 39));

        // 1. Ordenar por fecha y hora de llegada (ascendente)
        vuelos.sort(Comparator.comparing((Vuelo v) -> v.fechaLlegada)
                              .thenComparing(v -> v.horaLlegada));
        System.out.println("1. Lista ordenada por llegada:");
        vuelos.forEach(System.out::println);

        // 2. Último vuelo en llegar
        Vuelo ultimoVuelo = vuelos.get(vuelos.size() - 1);
        System.out.println("\n2. Último vuelo en llegar:");
        System.out.println("   -> " + ultimoVuelo.codigo + ": " + ultimoVuelo.origen + ", llega el " +
                ultimoVuelo.fechaLlegada + " a las " + ultimoVuelo.horaLlegada);

        // 3. Vuelo con menor número de pasajeros
        Vuelo vueloMenorPasajeros = Collections.min(vuelos, Comparator.comparingInt(v -> v.numPasajeros));
        System.out.println("\n3. Vuelo con menor número de pasajeros:");
        System.out.println("   -> " + vueloMenorPasajeros.codigo + ": " + vueloMenorPasajeros.origen +
                ", con " + vueloMenorPasajeros.numPasajeros + " pasajeros.");
    }
}