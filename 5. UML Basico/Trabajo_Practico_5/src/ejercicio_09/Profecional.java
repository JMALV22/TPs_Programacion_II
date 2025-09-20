
package ejercicio_09;

public class Profecional {
    
    private String nombre;
    private String especialidad;

    public Profecional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    public String mostrarDatosProfecional(){
        return nombre + ", Especialidad: " + especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profecional{" + "nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
    
}
