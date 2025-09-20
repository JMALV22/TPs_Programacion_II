
package ejercicio_06;

public class Reserva {

    private String fecha;
    private String hora;
    private Cliente cliente;     // Asociacion 1:1
    private Mesa mesa;           // Agregacion 1:1

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    
    public void mostrarReserva(){
        if (cliente != null){
            System.out.println("\nReserva de fecha " + fecha + ", " + hora 
        + "\nCliente: " + cliente.mostrarDatos()
        + "\nMesa: " + mesa.caracteristicaMesa() + "\n");
        } else {
            System.out.println("\nReserva de fecha " + fecha + ", " + hora 
        + "\nCliente: No asignado" 
        + "\nMesa: " + mesa.caracteristicaMesa() + "\n");
        }
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null){
            this.cliente = cliente;
        }
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", mesa=" + mesa + '}';
    }

}
