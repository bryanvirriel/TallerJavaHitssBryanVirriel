package entidades;

import genericos.Identificable;

public class Cliente implements Identificable<String>{
    private String id;
    private String nombre;
    
}

@Override
public String getId(){
    return id;
}

public String getNombre(){
    return nombre;
}
