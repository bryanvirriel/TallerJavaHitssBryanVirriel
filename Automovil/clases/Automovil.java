package clases;

public class Automovil {
    //Visibilidad; default -> a nivel paquete   
    //Atributos -> privados
    private String marca = "Toyota";
    private String color;
    private int anio;

    //metodos -> private, public, protected, default
    //constructor -> metodo especial
    public Automovil() {
    }
    //Metodos de acceso ==> Getter/Setter
    //Getter    
    public String getMarca(){
        return this.marca; 
    }
    //Setter
    public void setMarca(String marca){
        
        this.marca = marca; 
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
}