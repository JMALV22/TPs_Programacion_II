
package ejercicio_03;

public class Editorial {
    
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public String mostrarEditorial(){
        return nombre + ", Direccion: " + direccion;
    }

    public void setDireccion(String direccion) {
        if(direccion != null) {
            this.direccion = direccion;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
}
