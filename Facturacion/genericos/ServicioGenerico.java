package genericos;

import java.util.ArrayList;
import java.util.List;

public class ServicioGenerico<T extends Identificable<ID>, ID> {

    private List<T> datos = new ArrayList<>();


    //public ServicioGenerico(){
    //     datos = new ArrayList<>();
    //}
    //Buscar elemento por ID



    public T buscarPorId(ID id){
        for (T elemento : datos){
            if (elemento.getId().equals(id)) {
                return elemento;
                
            }
        }
        return null;
    }
    
}
