
package Clases;

import java.util.ArrayList;
import java.util.List;


public class Materia {
    
 
    private String nombre;
    
    public static final List<Materia> lista_materias = new ArrayList<>();

    public Materia() {
    }

    public Materia( String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    
    static{
        lista_materias.add(new Materia("Matematicas"));
        lista_materias.add(new Materia("Español"));
        lista_materias.add(new Materia("Quimica"));
        lista_materias.add(new Materia("Religion"));
        lista_materias.add(new Materia("Fisica"));
        lista_materias.add(new Materia("Quimica"));
    }
    
     @Override
    public String toString() {
        return nombre + " ";
    }
    
    
    
    
}
