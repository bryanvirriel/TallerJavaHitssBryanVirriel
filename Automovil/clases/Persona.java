package clases;

public class Persona {
    Automovil automovil;

    public Persona(){
        automovil = new Automovil();
    }

    public void crearAutomovil(){
        automovil = new Automovil();
        automovil.setMarca("Nissan");
        automovil.setColor("Blanco");
        automovil.setAnio(2025); 
        System.out.println("Marca: " + automovil.getMarca());
        System.out.println("Color: " + automovil.getColor());
        System.out.println("Año: " + automovil.getAnio());


}
}