
package trabajo_practico_3;

import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public void getInfo() {
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nAnio de publicacion: " + anioPublicacion);
    }
    
    public void agregarNuevoLibro() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese los datos del nuevo libro\nTitulo: ");
        titulo = input.nextLine();
        System.out.print("Autor: ");
        autor = input.nextLine();
        System.out.print("Anio de publicacion: ");
        anioPublicacion = Integer.parseInt(input.nextLine());
    }
    
    public void setModAnioPublicacion(int anioNuevo) {
        if (anioNuevo > 0) {
            anioPublicacion = anioNuevo;
        } else if (anioNuevo <= 0) {
            System.out.println("El anio ingresado no es valido");
        }
    }
}
