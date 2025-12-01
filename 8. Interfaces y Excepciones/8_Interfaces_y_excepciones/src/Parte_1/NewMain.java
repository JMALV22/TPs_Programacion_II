
package Parte_1;

public class NewMain {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Jose");
        Pedido pedido = new Pedido(cliente);

        Producto p1 = new Producto("Mouse", 8000);
        Producto p2 = new Producto("Teclado", 12000);

        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        Pago metodoPago = new TarjetaCredito();
        PagoConDescuento desc = new TarjetaCredito();
        double montoConDescuento = desc.aplicarDescuento(total);

        metodoPago.procesarPago(montoConDescuento);

        pedido.cambiarEstado("Enviado");
    }

}
