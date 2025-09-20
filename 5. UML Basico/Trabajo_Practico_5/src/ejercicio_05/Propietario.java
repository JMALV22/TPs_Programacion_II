
package ejercicio_05;

public class Propietario {
    
    private String nombre;
    private int dni;
    private Computadora computadora;

    public Propietario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setComputadora(Computadora computadora){
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this){
            computadora.setPropietario(this);
        }
    }

    public Computadora getComputadora() {
        return computadora;
    }
    
    public void mostrarPropietario(){
        if(computadora != null){
            System.out.println("Propietario:\nNombre: " + nombre + "\nDNI: "
            + dni + "\nComputadora: " + computadora.mostrarDatosDePc());
        } else{
            System.out.println("Propietario:\nNombre: " + nombre + "\nDNI: "
            + dni + "\nComputadora: Sin PC");
        }
    }
    
    public String mostrarDatosPropietario(){
        return nombre + ", DNI: " + dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
  
}
