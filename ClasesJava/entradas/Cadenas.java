package entradas;

public class Cadenas {

    public static void main(String[] args) {

    String nombre = " Eloy Sanchez Salmoran ";
    String nombre1 = "Eloy Sanchez SalMoran hola Eloy Sanchez SalMoran";
    System.out.println("length(): " + nombre.length());
    System.out.println("== " + (nombre == nombre1));
    System.out.println("equals(String b): " + (nombre.equals(nombre1))); //equlave si son iguales(contempla las mayusculas y las minusculas)
    System.out.println("equalIgnoreCase(String b): " + (nombre.equalsIgnoreCase(nombre1)));//equivale si son iguales siin importar nada
    System.out.println("charAt(int i): " + (nombre.charAt(6)));//te dice la letra que se posiciona 

    System.out.println("Nombre: " + nombre);
    System.out.println("trim(): " + nombre.trim());  //Elemina los despacios 

    System.out.println("substring(int a, int b): " + (nombre1.substring(5, 11)));//un rango de donde inicia y donde termina
    System.out.println("substring(int i): " + nombre1.substring(5));//Tomara donde quiere iniciar

    System.out.println("indexOf(String cadena): " + nombre1.indexOf("S"));//te busca el caracter de la letra o palabra escojas de izquierda a derecha(ejemplo la letra S)
    System.out.println("lastIndexOf(String Cadena): " + nombre1.lastIndexOf("hola"));//te busca el caracter de la letra o palabra escojas de derecha a izquierda

    System.out.println("starWith(String prefijo): " + nombre1.startsWith("E")); //Te dice la letra que pongas incia con el variable(nombre1) es verdadaro si no es falso
    System.out.println("endWith(String sufijo): " + nombre1.endsWith("n"));//lo mismmo de arriba pero con la ultima letra
    
    System.out.println("toLowerCase(): " + nombre1.toLowerCase());//Los hace minusculas 
    System.out.println("toUpperCase(): " + nombre1.toUpperCase());//Los hace mayusculas
 
 
    
    }
}
