
package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Director extends Usuario {
    
    private ArrayList<Profesor> profesores = new ArrayList<>();

    public Director() {
    }

    public Director(int documento, String nombre, String contraseña, String tipoUsuario) {
        super(documento, nombre, contraseña, tipoUsuario);
    }
    
    public void registrarProfesor(String nombre, int documento, Materia materia, String contraseña ){
        
          Profesor nuevoProfesor = new Profesor();
        nuevoProfesor.setNombre(nombre);
        nuevoProfesor.setDocumento(documento);
        nuevoProfesor.setMateria(materia.lista_materias.get(1));
        nuevoProfesor.setContraseña(contraseña);
 
        profesores.add(nuevoProfesor);
        
       JOptionPane.showMessageDialog(null, "Profesor Creado");
        
    }
    
    
    
}
