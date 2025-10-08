public class Evaluacion {
    private int año;
    private int puntaje; // 1-100

    public Evaluacion(int año, int puntaje) {
        this.año = año;
        this.puntaje = puntaje;
    }

    public int getAño() {
        return año;
    }

    public int getPuntaje() {
        return puntaje;
    }
}