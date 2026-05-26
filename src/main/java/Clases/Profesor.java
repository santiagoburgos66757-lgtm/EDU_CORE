
package Clases;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class Profesor extends Usuario{
    
    private Materia materia;    
    private ArrayList<Tarea> tareas = new ArrayList<>();

    public Profesor() {
    }

    public Profesor(Materia materia) {
        this.materia = materia;
    }

    public Profesor(Materia materia, int documento, String nombre, String contraseña, String tipoUsuario) {
        super(documento, nombre, contraseña, tipoUsuario);
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void mostraInfo(){
        System.out.println("Nombre: "+getNombre()+" Documento: "+getDocumento()+" Contraseña: "+getContraseña()+" Materia: "+materia);
    }
  
    
    public void crearTarea(String titulo, String descripcion, String fechaLimite){
         Tarea nuevaTarea = new Tarea();
        nuevaTarea.setTitulo(titulo);
        nuevaTarea.setDescripcion(descripcion);
        nuevaTarea.setFechaEntrega(fechaLimite);
 
        tareas.add(nuevaTarea);
        
        JOptionPane.showMessageDialog(null, "Tarea creada");
    }
    
    public void mostrarTareas(){
    for (Tarea t : tareas) {
        System.out.println(t);
    }
}
    
    
    
    
}
