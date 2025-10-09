
package ejercicio_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos =  new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    // Metodo critico para mantener la coherencia bidireccional 
    public void agregarCurso(Curso curso){
        // Evitamos duplicados
        if (curso != null && !cursos.contains(curso)){
            cursos.add(curso); // Mantener consistencia bidireccional
            // Esta validacion evita recursion infinita
            if (curso.getProfesor() != this){
                curso.setProfesor(this);
            }
        }
    }
    
    public void eliminarCurso(Curso curso){
        if (curso != null && cursos.contains(curso)){
            cursos.remove(curso);
            // Mantener consistencia bidireccional
            if(curso.getProfesor() == this){
                curso.setProfesor(null);
            }
        }
    }
    
    public List<Curso> getCurso(){
        return Collections.unmodifiableList(cursos);
    }
    
    public void listarCursos(){
        for (Curso curso : cursos){
            System.out.println("---------------");
            curso.mostrarInfo();
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Profesor: " + nombre 
        + "\nID: " + id + "\nEspecialidad " + especialidad
        + "\nCantidad de cursos: " + cursos.size());
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
 
    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cursos=" + cursos + '}';
    }
    
}
