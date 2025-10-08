public class empleado extends persona {
    private double remuneracion;
    private int empleadoId;

    public empleado(String nombre, String apellido, String numeroFiscal, String direccion,
                    double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() { return remuneracion; }
    public int getEmpleadoId() { return empleadoId; }

    public void aumentarRemuneracion(double porcentaje) {
        this.remuneracion += this.remuneracion * porcentaje / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Empleado ID: " + empleadoId +
               ", Remuneración: $" + remuneracion;
    }
}