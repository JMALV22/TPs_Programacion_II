
/*
TRABAJO PRACTICO N°3.
Alumno: ALVAREZ MESEGUES, Jose Matias
Comision: 18
*/

// 3. Encapsulamiento con la Clase Libro

package trabajo_practico_3;

public class PrincipalEjercicio_3 {

    public static void main(String[] args) {
        
        /*
        a. Crear una clase Libro con atributos privados: titulo, autor,
        añoPublicacion.
        Métodos requeridos: Getters para todos los atributos. Setter con validación
        para añoPublicacion.
        Tarea: Crear un libro, intentar modificar el año con un valor 
        inválido y luego con uno válido, mostrar la información final.
        */
        
        Libro harryPotter = new Libro();

        harryPotter.agregarNuevoLibro();
        
        harryPotter.getInfo();
        System.out.println("\n");
        
        harryPotter.setModAnioPublicacion(1997);
        
        harryPotter.getInfo();
    }

}
