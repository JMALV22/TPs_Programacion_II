
package ejercicio_1;

public class Producto {

    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
 
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    public void mostrarInfo(){
        System.out.println("Producto: " + nombre 
        + "\nID: " + id
        + "\nPrecio: " + precio
        + "\nCantidad: " + cantidad
        + "\nCategoria: " + categoria
        + "\n+++++++++++++++++++++++++++++++");
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setCantidad(int nuevaCantidad){
        if (nuevaCantidad >= 0){
            this.cantidad = nuevaCantidad;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    }

}