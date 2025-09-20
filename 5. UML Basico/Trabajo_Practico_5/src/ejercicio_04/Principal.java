
package ejercicio_04;

public class Principal {

    public static void main(String[] args) {
        
        Banco bbva = new Banco("BBVA", "35-12345678-9");
        Cliente jose = new Cliente("Jose", 9876543);
        TarjetaDeCredito visa = new TarjetaDeCredito("4562-1524-5665-8989", "02/02/2050", bbva);
        
        jose.setTarjetaDeCredito(visa);
        
        jose.mostrarTarjeDeCliente();
        System.out.println("");
        visa.mostrarDatosDeTarjeta();
        
    }

}
