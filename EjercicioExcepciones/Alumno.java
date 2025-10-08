class Alumno {
    String nombre;
    int edad;

    public Alumno(String nombre, int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser menor que 0.");
        }
        if (edad < 18) {
            throw new EdadInvalidaException("La edad debe ser al menos 18 años.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + ", Edad: " + edad;
    }
}