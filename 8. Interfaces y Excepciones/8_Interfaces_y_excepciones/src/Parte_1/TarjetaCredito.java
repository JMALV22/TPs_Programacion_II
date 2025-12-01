
package Parte_1;

public class TarjetaCredito implements Pago, PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando con tarjeta de credito: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95; // 5% descuento
    }
    
    
    
}
