
package ejercicio_03;

public class Principal {

    public static void main(String[] args) {
        
        Autor rowling = new Autor("J. K. Rowling", "Británica");
        Editorial bloomsbury = new Editorial("Bloomsbury", "16-22 Great Russell Street, Londres");
        Libro harryPotter = new Libro("Harry Potter y la Camara Secreta", "9788831000154", bloomsbury);
        
        System.out.println(harryPotter);
        
        harryPotter.setAutor(rowling);
        harryPotter.mostraLibro();
        
        System.out.println("");
        Editorial scholastic = new Editorial("Scholastic", "557 Broadway, New York");
        
        harryPotter.cambioEditorial(scholastic);
        harryPotter.mostraLibro();
 
    }

}
