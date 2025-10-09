
package ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nomre;
    private List<Libro> libros;

    public Biblioteca(String nomre) {
        this.nomre = nomre;
        this.libros = new ArrayList<>();
    }  // Constructor
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    
    public void listarLibros(){
        for(Libro libro : libros){
            libro.mostrarInfo();
        }
    }
    
    public void buscarLibroPorIsbn(String isbn){
        Libro libroEncontrado = null;
        int i = 0;
        while (libroEncontrado == null && i < libros.size()){
            if (libros.get(i).getIsbn().equalsIgnoreCase(isbn)){
                libroEncontrado = libros.get(i);      
            }
            i++;
        }
        if (libroEncontrado != null){
            System.out.println("El libro buscado es:");
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println("\nNo se encontro ningun libro con este ISBN\n");
        }
    }
    
    public void eliminarLibro(String isbn){
        Libro libroAEliminar = null;
        int i = 0;
        while (libroAEliminar == null && i < libros.size()){
            if (libros.get(i).getIsbn().equalsIgnoreCase(isbn)){
                libroAEliminar = libros.get(i); 
                libros.remove(libros.get(i));  
            }
            i++;
        }
        if (libroAEliminar != null){
            System.out.println("El libro " + libroAEliminar.getTitulo()
            + ", se elimino");
        } else {
            System.out.println("\nNo se encontro ningun libro con este ISBN\n");
        }
    }
    
    public int obtenerCantidadLibros(){
        int cantidadDeLibros = libros.size();
        return cantidadDeLibros; 
    }
    
    public void filtrarLibrosPorAnio(int anio){
        ArrayList<Libro> libroPorAño = new ArrayList<>();
        for (Libro libro : libros){
            if (libro.getAnioPublicacion() == anio){
                libroPorAño.add(libro);
            }
        }
        if(libroPorAño.isEmpty()){
            System.out.println("\nNo hay libro para ese anio.\n");
        } else {
            System.out.println("Los libro del anio " + anio + " son:");
            for(Libro libro : libroPorAño){
                libro.mostrarInfo();
            }
        }
    }
    
    public void mostrarAutoresDisponibles(){
        ArrayList<Autor> autores = new ArrayList<>();
        for (Libro libro : libros){
            if(buscarPorAutor(libro.getAutor(),autores)){
                autores.add(libro.getAutor());
            }
        }
        if (autores.isEmpty()){
            System.out.println("No hay autores disponibles");
        } else {
            System.out.println("Los autores disponibles son:");
            for(Autor autor : autores){
                System.out.println("");
                autor.mostrarInfo();
            }
        }
    }
    
    // Utilizamos esta buscar dentro de una lista de autores si el autor 
    // buscado se repite.
    private boolean buscarPorAutor(Autor autor, ArrayList<Autor> autores){
        boolean CORTE = true;
        int i = 0;
        while (CORTE == true && i < autores.size()){
            if (autores.get(i) == autor){
                CORTE = false;
            }
            i++;
        }
        return CORTE;
    }

    public String getNomre() {
        return nomre;
    }

}
