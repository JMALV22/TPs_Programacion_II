
package ejercicio_3;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public void setProfesor(Profesor profesor){
        // Si es el mismo Profesor, no hace nada;
        if (this.profesor == profesor){
            return;
        }
        // Si tenia un Profesor anterior, eliminarse de el mismo;
        if (this.profesor != null){
            this.profesor.eliminarCurso(this);
        }
        // Establecer el nuevo Profesor
        this.profesor = profesor;
        // Añadir al nuevo curso (si no es nulo);
        if (profesor != null && !profesor.getCurso().contains(this)){
            profesor.agregarCurso(this);
        }
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void mostrarInfo(){
        System.out.println("Curso: " 
        + nombre + "\nCodigo: " + codigo);
    }
    
    
  
}
