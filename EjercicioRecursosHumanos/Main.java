public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Empleado juan = new Empleado(1, "Juan", "TI", 60000, 6);
        juan.agregarEvaluacion(new Evaluacion(2022, 85));
        juan.agregarEvaluacion(new Evaluacion(2023, 92));

        Empleado ana = new Empleado(2, "Ana", "TI", 55000, 4);
        ana.agregarEvaluacion(new Evaluacion(2023, 88));

        Empleado maria = new Empleado(3, "Maria", "HR", 50000, 7);
        maria.agregarEvaluacion(new Evaluacion(2023, 91));

        empresa.agregarEmpleado(juan);
        empresa.agregarEmpleado(ana);
        empresa.agregarEmpleado(maria);

        // 1. Listar por departamento
        System.out.println("Empleados de TI:");
        empresa.listarPorDepartamento("TI").forEach(e -> System.out.println(e.getNombre()));

        // 2. Salario promedio
        System.out.println("Salario promedio TI: " + empresa.salarioPromedioPorDepartamento("TI"));

        // 3. Mayor salario
        System.out.println("Mayor salario: " + empresa.empleadoMayorSalario().getNombre());

        // 5. Top 3 última evaluación
        System.out.println("Top 3 última evaluación:");
        empresa.top3UltimaEvaluacion().forEach(e -> System.out.println(e.getNombre()));

        // 6. Empleados con eval > 90
        System.out.println("Empleados con evaluación > 90: " + empresa.contarEvaluacionesMayoresA90());

        // 7. Ranking por promedio
        System.out.println("Ranking por promedio:");
        empresa.rankingPromedioPuntajes().forEach(e ->
                System.out.println(e.getKey().getNombre() + " - Promedio: " + e.getValue()));
    }
}