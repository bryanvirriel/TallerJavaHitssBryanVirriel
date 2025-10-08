import java.util.*;

public class Torneo {
    private static Map<String, Disciplina> disciplinas = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static void fusionarEquipos() {
        System.out.print("Ingrese primera disciplina: ");
        String d1 = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese segunda disciplina: ");
        String d2 = scanner.nextLine().toLowerCase();

        if (!disciplinas.containsKey(d1) || !disciplinas.containsKey(d2)) {
            System.out.println("Alguna de las disciplinas no existe.");
            return;
        }

        Disciplina disc1 = disciplinas.get(d1);
        Disciplina disc2 = disciplinas.get(d2);

        // Fusionar jugadores de d1 a d2 sin borrar de d1
        for (Jugador j : disc1.getJugadores()) {
            disc2.agregarJugador(j);  // se evita duplicados gracias a Set
        }

        // Fusionar jugadores de d2 a d1 también (opcional, si fusión debe ser bidireccional)
        for (Jugador j : disc2.getJugadores()) {
            disc1.agregarJugador(j);
        }

        // Crear mapa para saber en qué disciplinas está cada jugador
        Map<Jugador, List<String>> jugadorDisciplinas = new HashMap<>();

        for (Map.Entry<String, Disciplina> entry : disciplinas.entrySet()) {
            String nombreDisc = entry.getKey();
            for (Jugador j : entry.getValue().getJugadores()) {
                jugadorDisciplinas.computeIfAbsent(j,k -> new ArrayList<>()).add(nombreDisc);
            }
        }

        // Mostrar resultados
        System.out.println("\n Disciplinas por jugador:");
        for (Map.Entry<Jugador, List<String>> entry : jugadorDisciplinas.entrySet()) {
            Jugador jugador = entry.getKey();
            List<String> enDisciplinas = entry.getValue();
            System.out.println(jugador + " → " + String.join(", ", enDisciplinas));
        }
    }

    private static void jugadoresComunes() {
        System.out.print("Ingrese primera disciplina: ");
        String d1 = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese segunda disciplina: ");
        String d2 = scanner.nextLine().toLowerCase();

        if (!disciplinas.containsKey(d1) || !disciplinas.containsKey(d2)) {
            System.out.println("Alguna de las disciplinas no existe.");
            return;
        }

        Set<Jugador> jugadoresD1 = disciplinas.get(d1).getJugadores();
        Set<Jugador> jugadoresD2 = disciplinas.get(d2).getJugadores();

        Set<Jugador> comunes = new HashSet<>(jugadoresD1);
        comunes.retainAll(jugadoresD2);

        if (comunes.isEmpty()) {
            System.out.println("No hay jugadores comunes entre " + d1 + " y " + d2);
        } else {
            System.out.println("Jugadores comunes entre " + d1 + " y " + d2 + ":");
            for (Jugador j : comunes) {
                System.out.println(j);
            }
        }
    }

    private static void moverJugador() {
        System.out.print("Ingrese disciplina origen: ");
        String origen = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese disciplina destino: ");
        String destino = scanner.nextLine().toLowerCase();

        if (!disciplinas.containsKey(origen) || !disciplinas.containsKey(destino)) {
            System.out.println("Alguna de las disciplinas no existe.");
            return;
        }

        System.out.print("Ingrese ID del jugador a mover: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        // Buscar el jugador por ID en la disciplina de origen
        Jugador jugadorAMover = null;
        for (Jugador j : disciplinas.get(origen).getJugadores()) {
            if (j.getId() == id) {
                jugadorAMover = j;
                break;
            }
        }

        if (jugadorAMover == null) {
            System.out.println("Jugador no encontrado en " + origen);
            return;
        }

        // Eliminar de la original y agregar a la nueva
        disciplinas.get(origen).eliminarJugador(jugadorAMover);
        boolean agregado = disciplinas.get(destino).agregarJugador(jugadorAMover);

        if (agregado) {
            System.out.println("Jugador movido de " + origen + " a " + destino);
        } else {
            System.out.println("El jugador ya estaba en " + destino);
        }
    }

    private static void mostrarOrdenadosPorNombre() {
        List<Jugador> todos = new ArrayList<>();

        for (Disciplina d : disciplinas.values()) {
            todos.addAll(d.getJugadores());
        }

        todos.sort(Comparator.comparing(Jugador::getNombre));

        System.out.println("Jugadores ordenados por nombre:");
        for (Jugador j : todos) {
            System.out.println(j);
        }
    }

    private static void listarOrdenInscripcion() {
        System.out.println("Listado en orden de inscripción:");
        for (String nombre : disciplinas.keySet()) {
            System.out.println("Disciplina: " + nombre);
            for (Jugador j : disciplinas.get(nombre).getJugadores()) {
                System.out.println("  " + j);
            }
        }
    }

    private static void rankingPorID() {
        List<Jugador> todos = new ArrayList<>();

        for (Disciplina d : disciplinas.values()) {
            todos.addAll(d.getJugadores());
        }

        todos.sort(Comparator.comparingInt(Jugador::getId));

        System.out.println("Ranking de jugadores por ID:");
        for (Jugador j : todos) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        iniciarDisciplinas(); // Inicializamos con fútbol, básquetbol y voleibol

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> contarJugadores();
                case 2 -> fusionarEquipos();
                case 3 -> jugadoresComunes();
                case 4 -> moverJugador();
                case 5 -> mostrarOrdenadosPorNombre();
                case 6 -> listarOrdenInscripcion();
                case 7 -> rankingPorID();
                case 8 -> registrarJugador();
                case 9 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 9);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú Torneo Deportivo Universitario ---");
        System.out.println("1. Contar jugadores en cada disciplina");
        System.out.println("2. Fusionar equipos");
        System.out.println("3. Encontrar jugadores comunes entre deportes");
        System.out.println("4. Mover jugador de un deporte a otro");
        System.out.println("5. Mostrar jugadores ordenados por nombre");
        System.out.println("6. Generar listado en orden de inscripción");
        System.out.println("7. Ranking de jugadores por ID");
        System.out.println("8. Registrar jugador");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void iniciarDisciplinas() {
        disciplinas.put("futbol", new Disciplina("futbol"));
        disciplinas.put("basquetbol", new Disciplina("basquetbol"));
        disciplinas.put("voleibol", new Disciplina("voleibol"));
    }

    // Aquí van las funciones específicas como registrarJugador, contarJugadores, etc.

    private static void registrarJugador() {
        System.out.print("Ingrese nombre de la disciplina: ");
        String disc = scanner.nextLine().toLowerCase();

        if (!disciplinas.containsKey(disc)) {
            System.out.println("Disciplina no existe.");
            return;
        }

        System.out.print("Ingrese ID del jugador: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese nombre del jugador: ");
        String nombre = scanner.nextLine();

        Jugador jugador = new Jugador(id, nombre);
        boolean agregado = disciplinas.get(disc).agregarJugador(jugador);

        if (agregado) {
            System.out.println("Jugador registrado.");
        } else {
            System.out.println("Jugador ya estaba registrado.");
        }
    }

    private static void contarJugadores() {
        for (String key : disciplinas.keySet()) {
            System.out.println(key + ": " + disciplinas.get(key).getJugadores().size() + " jugadores");
        }
    }
}