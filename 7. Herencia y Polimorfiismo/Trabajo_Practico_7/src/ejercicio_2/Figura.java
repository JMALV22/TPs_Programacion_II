
package ejercicio_2;

public abstract class Figura {

    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public void calcularArea(){
        System.out.println("No hay datos de la figura para calcular area");
    }
    
    public String mostrarArea(){
        return "El area del " + nombre
        + " es: ";
    }

    public String getNombre() {
        return nombre;
    }

}
