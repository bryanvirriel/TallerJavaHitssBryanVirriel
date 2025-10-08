import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo {
    String codigo;
    String origen;
    String destino;
    LocalDate fechaLlegada;
    LocalTime horaLlegada;
    int numPasajeros;

    public Vuelo(String codigo, String origen, String destino, LocalDate fechaLlegada, LocalTime horaLlegada, int numPasajeros) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;
        this.numPasajeros = numPasajeros;
    }

    public String toString() {
        return String.format("%s %s -> %s, %s %s, %d pasajeros",
                codigo, origen, destino, fechaLlegada, horaLlegada, numPasajeros);
    }
}
