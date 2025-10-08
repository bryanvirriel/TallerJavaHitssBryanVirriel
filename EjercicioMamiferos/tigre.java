public class tigre extends felino {
    private String especieTigre;

    public tigre(String habitat, float altura, float largo, float peso, String nombreCientifico,
                 float tamañoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() { return especieTigre; }

    public String comer() {
        return "El Tigre " + especieTigre + " caza en solitario.";
    }

    public String dormir() {
        return "El Tigre duerme en la selva de " + habitat + ".";
    }

    public String correr() {
        return "El Tigre puede correr hasta " + velocidad + " km/h.";
    }

    public String comunicarse() {
        return "El Tigre ruge para marcar su territorio.";
    }
}