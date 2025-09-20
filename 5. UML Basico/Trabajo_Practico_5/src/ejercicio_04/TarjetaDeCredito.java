
package ejercicio_04;

public class TarjetaDeCredito {
    
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito()!= this){
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    public void mostrarDatosDeTarjeta(){
        System.out.println("Tarjeta numero: " + numero + " del banco " + banco
        + " con fecha de vencimiento: " + fechaVencimiento 
        + "\nPertenece al cliente: " + cliente.getNombre() + " con DNI: " 
        + cliente.getDni());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", banco=" + banco + '}';
    }

}
