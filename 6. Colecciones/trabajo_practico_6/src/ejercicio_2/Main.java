
package ejercicio_2;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("\nPunto 1) del ejercicio:");
        System.out.println("Creamos una biblioteca.");
        
        Biblioteca biblo1 = new Biblioteca("Biblioteca Central");
        
        System.out.println("\nPunto 2) del ejercicio:");
        System.out.println("Crear al menos tres autores.");
        
        Autor cervantes = new Autor("MC1234", "Miguel de Cervantes", "Español");
        Autor marquez   = new Autor("GGM5678", "Gabriel Garcia Marquez", "Colombiano");
        Autor rowling   = new Autor("JKR9876", "J.K. Rowling", "Britanica");
        
        System.out.println("\nPunto 3) del ejercicio:");
        System.out.println("Agregar 5 libros asociados a alguno de los Autores a la biblioteca.");
      
        biblo1.agregarLibro("9788869183157", "Harry Potter y la piedra filosofal", 1997, rowling);
        biblo1.agregarLibro("9781668650905", "The Hallmarked Man", 2025, rowling);
        biblo1.agregarLibro("9789510445365", "Cien anios de soledad", 1967, marquez);
        biblo1.agregarLibro("9780744525021", "Don Quijote", 1605, cervantes);
        biblo1.agregarLibro("9788411260541", "La gitanilla", 1613, cervantes);
        
        System.out.println("\nPunto 4) del ejercicio:");
        // Listar todos los libros con su información y la del autor.
        
        biblo1.listarLibros();
        
        System.out.println("\nPunto 5) del ejercicio:");
        // Buscar un libro por su ISBN y mostrar su información.
        
        biblo1.buscarLibroPorIsbn("9789510445365");
        
        System.out.println("\nPunto 6) del ejercicio:");
        // Filtrar y mostrar los libros publicados en un año específico.
        
        biblo1.filtrarLibrosPorAnio(1967);
        
        System.out.println("\nPunto 7) del ejercicio:");
        // Eliminar un libro por su ISBN y listar los libros restantes.
        
        biblo1.eliminarLibro("9788411260541");
        System.out.println("");
        biblo1.listarLibros();
        
        System.out.println("\nPunto 8) del ejercicio:");
        // Mostrar la cantidad total de libros en la biblioteca.
        
        System.out.println("La cantidad total de libros en la biblioteca "
        + biblo1.getNomre() + " es de: " + biblo1.obtenerCantidadLibros());
//        
        System.out.println("\nPunto 9) del ejercicio:");
        // Listar todos los autores de los libros disponibles en la biblioteca.
        
        biblo1.mostrarAutoresDisponibles();
        
    }

}
