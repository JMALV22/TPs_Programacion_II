
/*
TRABAJO PRACTICO N°3.
Alumno: ALVAREZ MESEGUES, Jose Matias
Comision: 18
*/

// 4. Gestión de Gallinas en Granja Digital

package trabajo_practico_3;

public class PrincipalEjercicio_4 {

    public static void main(String[] args) {
        
        /*
        a. Crear una clase Gallina con los atributos: idGallina, edad,
        huevosPuestos.
        Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
        Tarea: Crear dos gallinas, simular sus acciones (envejecer y 
        poner huevos), y mostrar su estado.
        */
        
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        // Gallina 1: Mediante menu se agregan los valores.
        gallina1.agregarGallina();
        
        gallina1.mostrarEstado();
        // Mediante menu se puede modificar los datos (edad y cantidad de huevos)
        gallina1.setGallina();
        
        gallina1.mostrarEstado();
        
        // Gallina 2: Mediante menu se agregan los valores.
        gallina2.agregarGallina();
        
        gallina2.mostrarEstado();
        // Mediante menu se puede modificar los datos (edad y cantidad de huevos)
        gallina2.setGallina();
        
        gallina2.mostrarEstado();
        
    }

}
