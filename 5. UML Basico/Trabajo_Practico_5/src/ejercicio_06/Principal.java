
package ejercicio_06;

public class Principal {

    public static void main(String[] args) {
        
        Mesa mesa03 = new Mesa("03", "04");
        Cliente matias = new Cliente("Matias", "1166485222");
        Reserva v000254 = new Reserva("13/05/2065", "11:55", mesa03); 
        
        v000254.mostrarReserva();
        
        v000254.setCliente(matias);
        
        v000254.mostrarReserva();
        
    }

}
