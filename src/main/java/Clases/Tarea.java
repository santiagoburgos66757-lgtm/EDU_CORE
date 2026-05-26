
package Clases;

import java.util.Date;


public class Tarea {

    private String titulo;
    private String descripcion;
    private String fechaEntrega;
    private boolean completada;
    private double nota;

    public Tarea() {
    }
        public Tarea(String nombre, String descripcion, String fechaEntrega) {
        this(nombre, descripcion, fechaEntrega, false, 0.0);
    }

    public Tarea( String titulo, String descripcion, String fechaEntrega,boolean completada, double nota) {
     
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.completada = false;
         this.nota = nota;
    }

    
      public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }




    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
     public String toString() {
     return "Título: " + titulo +
           " | Descripción: " + descripcion +
           " | Fecha: " + fechaEntrega;
}
    
    
}
