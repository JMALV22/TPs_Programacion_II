
package ejercicio_1;

public class main {

    public static void main(String[] args) {
        
        // Punto 1) del ejercicio:
        // Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        
        Producto leche     = new Producto("A124B54", "Lecher", 1200, 10, CategoriaProducto.ALIMENTOS);
        Producto celular   = new Producto("E88B545", "Celular Samsung", 150000, 4, CategoriaProducto.ELECTRONICA);
        Producto zapatilla = new Producto("R665B54", "Zapatilla adidas", 20000, 6, CategoriaProducto.ROPA);
        Producto silla     = new Producto("H999454", "Silla plastica", 1500, 50, CategoriaProducto.HOGAR);
        Producto harina    = new Producto("A325454", "Harina 0000", 900, 15, CategoriaProducto.ALIMENTOS);
        Producto remera    = new Producto("R669855", "Remera hombre", 15000, 10, CategoriaProducto.ROPA);
        Producto aceite    = new Producto("A124B00", "Aceite cocinero", 1800, 12, CategoriaProducto.ALIMENTOS);
        
        Inventario numero1 = new Inventario("Octubre2025");
        
        numero1.agregarProducto(leche);
        numero1.agregarProducto(celular);
        numero1.agregarProducto(zapatilla);
        numero1.agregarProducto(silla);
        numero1.agregarProducto(harina);
        numero1.agregarProducto(remera);
        numero1.agregarProducto(aceite);
        
        System.out.println("\nPunto 2) del ejercicio:");
        // Listar todos los productos mostrando su información y categoría.
        
        numero1.listarProductos();

        System.out.println("\nPunto 3) del ejercicio:");
        // Buscar un producto por ID y mostrar su información.
        
        numero1.buscarProductoPorId("A325454");
        
        System.out.println("\nPunto 4) del ejercicio:");
        // Filtrar y mostrar productos que pertenezcan a una categoría específica.
        
        numero1.filtrarPorCategoria(CategoriaProducto.HOGAR);
        numero1.eliminarProducto("H999454");
        System.out.println("");
        numero1.filtrarPorCategoria(CategoriaProducto.HOGAR);
        
        System.out.println("\nPunto 5) del ejercicio:");
        // Eliminar un producto por su ID y listar los productos restantes.

        numero1.listarProductos();
        System.out.println("||||||||||||||||||||||||||||||||");
        numero1.eliminarProducto("H999454");
        System.out.println("||||||||||||||||||||||||||||||||");
        numero1.listarProductos();
        
        System.out.println("\nPunto 6) del ejercicio:");
        // Actualizar el stock de un producto existente.
        
        numero1.listarProductos();
        System.out.println("||||||||||||||||||||||||||||||||");
        numero1.actualizarStock("E88B545", 10);
        System.out.println("||||||||||||||||||||||||||||||||");
        numero1.listarProductos();
        
        System.out.println("\nPunto 7) del ejercicio:");
        // Mostrar el total de stock disponible.
        
        numero1.obtenerTotalStock();
        
        System.out.println("\nPunto 8) del ejercicio:");
        // Obtener y mostrar el producto con mayor stock.
        
        numero1.obtenerProductoConMayorStock();
        
        System.out.println("\nPunto 9) del ejercicio:");
        // Filtrar productos con precios entre $1000 y $3000.
        
        numero1.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("\nPunto 10) del ejercicio:");
        // Mostrar las categorías disponibles con sus descripciones.
        
        numero1.mostrarCategoriasDisponibles();
        
    }

}
