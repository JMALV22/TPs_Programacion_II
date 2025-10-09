
package ejercicio_1;

import java.util.ArrayList;

public class Inventario {
    
    private String nombre;
    private ArrayList<Producto> productos;

    public Inventario(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }
    
    // Se agrega producto al listado;
    public void agregarProducto(Producto p){
        this.productos.add(p);
    }
    
    // Se muestran productos que tenemos en el inventario;
    public void listarProductos(){
        for(Producto producto : productos){
            producto.mostrarInfo();
        }
    }
    
    // Se busca producto con id, el metodo busca y corta la busqueda
    // al encontrar el mismo, luego imprime por pantalla mediante el
    // metodo mostrarInfo() de la clase Producto;
    public void buscarProductoPorId(String id){
        Producto productoEncontrado = null;
        int i = 0;
        while(productoEncontrado == null && i < this.productos.size()){
            if (productos.get(i).getId().equalsIgnoreCase(id)){
                productoEncontrado = productos.get(i);
            }
            i++;
        }
        // Mediante este if se verifica si es null o se encotro algo. 
        if (productoEncontrado != null){ 
            productoEncontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado");
        }
    }
     
    // Mediante el id del producto, el metodo busca y corta la busqueda
    // al encontrar el mismo, luego se guarda el producto a eliminar para 
    // posterior mostrar el mismo y se borra de la lista.
    public void eliminarProducto(String id){
        Producto productoEliminado = null;
        int i = 0;
        while(productoEliminado == null && i < this.productos.size()){
            if (productos.get(i).getId().equalsIgnoreCase(id)){
                productoEliminado = productos.get(i);
                productos.remove(productos.get(i));
            }
            i++;
        }
        if (productoEliminado != null){
            System.out.println("Producto: " 
            + productoEliminado.getNombre() + ", ELIMINADO.");
        } else {
            System.out.println("Producto no encontrado");
        }
    }
    
    // Mediante el id del producto, el metodo busca y corta la busqueda
    // al encontrar el mismo, luego se guarda el producto al cual se le  
    // actualiza el stock disponible mediante la metodo set().
    public void actualizarStock(String id, int nuevaCantidad){
        Producto productoEncontrado = null;
        int i = 0;
        while(productoEncontrado == null && i < this.productos.size()){
            if (productos.get(i).getId().equalsIgnoreCase(id)){
                productoEncontrado = productos.get(i);
                productos.get(i).setCantidad(nuevaCantidad);
            }
            i++;
        }
        if (productoEncontrado != null){
            System.out.println("Producto: " 
            + productoEncontrado.getNombre() + ", se actualizo la cantidad."
            + "\nNueva cantidad: " + productoEncontrado.getCantidad());
        } else {
            System.out.println("Producto no encontrado");
        }
    }
    
    // Para filtrar por categoria, te inicializa un ArrayList interno del
    // metodo donde se guardara los productos de la categoria buscada
    // Por ultimo se verifica si esta vacia esa lista o si logro encotrar
    // algun producto.
    public void filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> productosPorCatego = new ArrayList<>();
        for (Producto producto : productos){
            if (producto.getCategoria().equals(categoria)){
                productosPorCatego.add(producto);
            }
        }
        if (productosPorCatego.isEmpty()){
            System.out.println("No hay productos con esa categoria");
        } else {
            for(Producto producto : productosPorCatego){
                producto.mostrarInfo();
            }
        }
    }
    
    public void obtenerTotalStock(){
        int total = 0;
        for (Producto producto : productos){
            total += producto.getCantidad();
        }
        System.out.println("El stock total es de: " + total);
    }
    
    public void obtenerProductoConMayorStock(){
        Producto productoConMayorStock = null;
        int i = 0;
        for (Producto producto : productos){
            if(producto.getCantidad() > i){
                i = producto.getCantidad();
                productoConMayorStock = producto;
            }
        }
        System.out.println("El producto con mayor Stock es: ");
        productoConMayorStock.mostrarInfo();
    }
    
    public void filtrarProductosPorPrecio(double min, double max){
        ArrayList<Producto> productosPorRango = new ArrayList<>();
        for (Producto producto : productos){
            if(producto.getPrecio() >= min && producto.getPrecio() <= max){
                productosPorRango.add(producto);
            }
        }
        if (productosPorRango.isEmpty()){
            System.out.println("No hay productos entre $"
            + min + " y $" + max);
        } else {
            System.out.println("Los porductos encontrados entre $" 
            + min + " y $" + max + ", son:");
            for(Producto producto : productosPorRango){
                producto.mostrarInfo();
            }
        }
    }
    
    public void mostrarCategoriasDisponibles(){
        CategoriaProducto[] categoria = CategoriaProducto.values();
        for (int i = 0; i < categoria.length; i++) {
            System.out.println(categoria[i] + ": " + categoria[i].getDescripcion());
        }
    }
            
    @Override
    public String toString() {
        return "Inventario{" + "nombre=" + nombre + '}';
    }
   
}
 