public class perro extends canino {
    private int fuerzaMordida;

    public perro(String habitat, float altura, float largo, float peso, String nombreCientifico,
                 String color, float tamañoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamañoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() { return fuerzaMordida; }

    public String comer() {
        return "El Perro salvaje africano muerde con fuerza de " + fuerzaMordida + " psi.";
    }

    public String dormir() {
        return "El Perro salvaje africano duerme en madrigueras.";
    }

    public String correr() {
        return "Corre en manada para cazar presas más grandes.";
    }

    public String comunicarse() {
        return "Se comunica con chillidos y gestos corporales.";
    }
}