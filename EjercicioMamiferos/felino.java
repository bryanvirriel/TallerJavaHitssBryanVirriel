public abstract class felino extends mamiferos {
    protected float tamañoGarras;
    protected int velocidad;

    public felino(String habitat, float altura, float largo, float peso, String nombreCientifico,
                  float tamañoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamañoGarras = tamañoGarras;
        this.velocidad = velocidad;
    }

    public float getTamañoGarras() { return tamañoGarras; }
    public int getVelocidad() { return velocidad; }
}

