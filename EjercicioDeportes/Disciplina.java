import java.util.*;

public class Disciplina {
    private String nombre;
    private Set<Jugador> jugadores;

    public Disciplina(String nombre) {
        this.nombre = nombre;
        this.jugadores = new LinkedHashSet<>(); // conserva orden de inserción
    }

    public String getNombre() {
        return nombre;
    }

    public boolean agregarJugador(Jugador jugador) {
        return jugadores.add(jugador); // no permite duplicados
    }

    public boolean eliminarJugador(Jugador jugador) {
        return jugadores.remove(jugador);
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public List<Jugador> getJugadoresOrdenadosPorNombre() {
        List<Jugador> lista = new ArrayList<>(jugadores);
        lista.sort(Comparator.comparing(Jugador::getNombre));
        return lista;
    }

    public List<Jugador> getJugadoresOrdenadosPorId() {
        List<Jugador> lista = new ArrayList<>(jugadores);
        lista.sort(Comparator.comparingInt(Jugador::getId));
        return lista;
    }

    public void mostrarJugadores() {
        for (Jugador j : jugadores) {
            System.out.println(j);
        }
    }
}