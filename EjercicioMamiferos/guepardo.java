public class guepardo extends felino {

    public guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico,
                    float tamañoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamañoGarras, velocidad);
    }

    public String comer() {
        return "El Guepardo atrapa presas pequeñas a gran velocidad.";
    }

    public String dormir() {
        return "El Guepardo duerme en zonas altas para vigilar.";
    }

    public String correr() {
        return "El Guepardo alcanza hasta " + velocidad + " km/h.";
    }

    public String comunicarse() {
        return "El Guepardo emite chillidos para comunicarse.";
    }
}