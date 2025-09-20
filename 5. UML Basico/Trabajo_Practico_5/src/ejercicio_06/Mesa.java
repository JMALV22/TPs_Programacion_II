
package ejercicio_06;

public class Mesa {

    private String numero;
    private String capacidad;

    public Mesa(String numero, String capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    
    public String caracteristicaMesa(){
        return numero + " - capacidad: " + capacidad + " personas.";
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
    }
    
}
