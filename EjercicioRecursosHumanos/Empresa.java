import java.util.*;
import java.util.stream.Collectors;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    // 1. Listar empleados por departamento ordenados alfabéticamente
    public List<Empleado> listarPorDepartamento(String departamento) {
        return empleados.stream()
                .filter(e -> e.getDepartamento().equalsIgnoreCase(departamento))
                .sorted(Comparator.comparing(Empleado::getNombre))
                .collect(Collectors.toList());
    }

    // 2. Calcular salario promedio por departamento
    public double salarioPromedioPorDepartamento(String departamento) {
        List<Empleado> filtrados = empleados.stream()
                .filter(e -> e.getDepartamento().equalsIgnoreCase(departamento))
                .collect(Collectors.toList());

        if (filtrados.isEmpty()) return 0;

        return filtrados.stream().mapToDouble(Empleado::getSalario).average().orElse(0);
    }

    // 3. Empleado con mayor salario
    public Empleado empleadoMayorSalario() {
        return empleados.stream()
                .max(Comparator.comparing(Empleado::getSalario))
                .orElse(null);
    }

    // 4. Empleados con >5 años experiencia y salario > 50,000
    public List<Empleado> empleadosConExperienciaYSalario() {
        return empleados.stream()
                .filter(e -> e.getAñosExperiencia() > 5 && e.getSalario() > 50000)
                .collect(Collectors.toList());
    }

    // 5. Top 3 empleados con mejor puntaje en última evaluación
    public List<Empleado> top3UltimaEvaluacion() {
        return empleados.stream()
                .filter(e -> e.getUltimaEvaluacion() != null)
                .sorted((e1, e2) -> Integer.compare(
                        e2.getUltimaEvaluacion().getPuntaje(),
                        e1.getUltimaEvaluacion().getPuntaje()))
                .limit(3)
                .collect(Collectors.toList());
    }

    // 6. Contar empleados con alguna evaluación > 90
    public long contarEvaluacionesMayoresA90() {
        return empleados.stream()
                .filter(e -> e.getEvaluaciones().stream().anyMatch(ev -> ev.getPuntaje() > 90))
                .count();
    }

    // 7. Ranking de empleados por puntaje promedio
    public List<Map.Entry<Empleado, Double>> rankingPromedioPuntajes() {
        return empleados.stream()
                .map(e -> Map.entry(e, e.getPromedioEvaluaciones()))
                .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .collect(Collectors.toList());
    }
}