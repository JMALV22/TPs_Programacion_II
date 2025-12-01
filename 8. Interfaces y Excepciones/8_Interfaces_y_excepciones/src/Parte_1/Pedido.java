
package Parte_1;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {

    private List<Producto> productos;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
        notificar("Producto agregado: " + producto.getNombre());
    }
    
    public void mostrarPedido(){
        if(!productos.isEmpty()){
           System.out.println("Productos: ");
            int i = 1;
            for (Producto producto : productos) {
                System.out.println(i + ") "
                + "Nombre: " + producto.getNombre() 
                + " / Precio: " + producto.getPrecio());
                i ++;
            } 
        } else {
            System.out.println("El pedido se encuentra vacio");
        }
        
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos){
        total =+ producto.getPrecio();
        }
        return total;
    } 
    
    // Notificación al cliente cuando hay cambios
    private void notificar(String mensaje) {
        cliente.notificar(mensaje);
    }

    public void cambiarEstado(String estado) {
        notificar("El pedido cambio su estado a: " + estado);
    }
 
}
