public class lobo extends canino {
    private int numCamada;
    private String especieLobo;

    public lobo(String habitat, float altura, float largo, float peso, String nombreCientifico,
                String color, float tamañoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamañoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public String getEspecieLobo() { return especieLobo; }

    public String comer() {
        return "El Lobo " + especieLobo + " comparte la comida con su camada de " + numCamada + ".";
    }

    public String dormir() {
        return "El Lobo " + color + " duerme en cuevas en " + habitat + ".";
    }

    public String correr() {
        return "El Lobo corre coordinadamente con su manada.";
    }

    public String comunicarse() {
        return "El Lobo aúlla para llamar a otros lobos.";
    }
}