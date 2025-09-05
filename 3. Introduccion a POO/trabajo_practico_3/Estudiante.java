
package trabajo_practico_3;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;

    public void getInfo() {
        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nCurso: " + curso + "\nCalificacion: " + calificacion);
    }
    
    public void setAlumno(String nombre, String apellido, String curso, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void subirCalificacion(int puntos){
        if ((calificacion + puntos) < 10){
            calificacion += puntos;
        }    
    }
    
    public void bajarCalificacion(int puntos){
        if ((calificacion - puntos) > 0){
            calificacion -= puntos;
        }    
    }
    
    
}
