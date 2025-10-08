import java.util.*;

public class Empleado {
    private int id;
    private String nombre;
    private String departamento;
    private double salario;
    private int añosExperiencia;
    private List<Evaluacion> evaluaciones;

    public Empleado(int id, String nombre, String departamento, double salario, int añosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.añosExperiencia = añosExperiencia;
        this.evaluaciones = new ArrayList<>();
    }

    public void agregarEvaluacion(Evaluacion e) {
        evaluaciones.add(e);
    }

    public Evaluacion getUltimaEvaluacion() {
        return evaluaciones.stream()
                .max(Comparator.comparing(Evaluacion::getAño))
                .orElse(null);
    }

    public double getPromedioEvaluaciones() {
        if (evaluaciones.isEmpty()) return 0;
        return evaluaciones.stream().mapToInt(Evaluacion::getPuntaje).average().orElse(0);
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getDepartamento() { return departamento; }
    public double getSalario() { return salario; }
    public int getAñosExperiencia() { return añosExperiencia; }
    public List<Evaluacion> getEvaluaciones() { return evaluaciones; }
}