
package ejercicio_04;

public class Cliente {
    
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjetaDeCredito;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito){
        this.tarjetaDeCredito = tarjetaDeCredito;
        if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this){
            tarjetaDeCredito.setCliente(this);
        }
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }
    
    public void mostrarTarjeDeCliente(){
        System.out.println("El cliente " + nombre + " con DNI " + dni 
                + "\ntiene asignada la tarjeta: numero " + tarjetaDeCredito.getNumero() 
                + " del banco: " + tarjetaDeCredito.getBanco());             
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

}
