public abstract class canino extends mamiferos{
    protected String color;
    protected float tamañoColmillos;

    public canino(String habitat, float altura, float largo, float peso, String nombreCientifico,
                  String color, float tamañoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamañoColmillos = tamañoColmillos;
    }

    public String getColor() { return color; }
    public float getTamañoColmillos() { return tamañoColmillos; }
}


