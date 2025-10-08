package prueba;

import clases.Automovil;
import clases.Persona;

public class TestMain {
    public static void main(String[] args) {
        Automovil auto = new Automovil();
        Persona persona = new Persona();
        //auto.color = "Roja";
        //auto.anio = 2025;
        auto.setMarca("Ford");
        auto.setColor("Azul");
        auto.setAnio(2025);
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Color: " + auto.getColor()); 
        System.out.println("Año: " + auto.getAnio());   
        System.out.println("-------------------------" );
        persona.crearAutomovil();    
     
    }
    
}
