
package ejercicio_03;

public class Libro {

    private String titulo;
    private String isbn;
    private Autor autor;           // Asociacion 1:1
    private Editorial editorial;   // Agregacion 1:1

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    public void mostraLibro(){
        System.out.println("Libro: " + titulo + "\nAutor: " + autor.mostrarAutor() 
                + "\nEditorial: " + editorial.mostrarEditorial() + "\nISBN: " + isbn);
    }
    
    public Editorial cambioEditorial( Editorial editorial){
        if (editorial != null) {
            this.editorial = editorial;
        } return this.editorial;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
 
}
