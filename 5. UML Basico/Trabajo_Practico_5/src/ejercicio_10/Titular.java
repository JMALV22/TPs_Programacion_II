
package ejercicio_10;

public class Titular {
    
    private String nombre;
    private int dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria){
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this){
            cuentaBancaria.setTitular(this);
        }
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
    
    public String datosTitular(){
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
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", cuentaBancaria=" + cuentaBancaria + '}';
    }
 
}