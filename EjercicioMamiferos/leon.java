public class leon extends felino {
    private int numManada;
    private float potenciaRugidoDecibel;

    public leon(String habitat, float altura, float largo, float peso, String nombreCientifico,
                float tamañoGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() { return numManada; }
    public float getPotenciaRugidoDecibel() { return potenciaRugidoDecibel; }

    public String comer() {
        return "El León caza junto a su grupo de " + numManada + " individuos en las llanuras de " + habitat + ".";
    }

    public String dormir() {
        return "El León duerme bajo los árboles de " + habitat + ".";
    }

    public String correr() {
        return "El León corre a una velocidad de " + velocidad + " km/h.";
    }

    public String comunicarse() {
        return "El León ruge con una potencia de " + potenciaRugidoDecibel + " decibelios.";
    }
}