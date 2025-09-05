
/*
TRABAJO PRACTICO N°3.
Alumno: ALVAREZ MESEGUES, Jose Matias
Comision: 18
*/

// 1. Registro de Estudiante

package trabajo_practico_3;

public class PrincipalEjercicio_1 {

    public static void main(String[] args) {
        
        /*
        a. Crear una clase Estudiante con los atributos: nombre, apellido, 
        curso, calificación.
        Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
        bajarCalificacion(puntos).
        Tarea: Instanciar a un estudiante, mostrar su información, 
        aumentar y disminuir calificaciones.
        */
        // Se crea el alumno
        Estudiante alumno = new Estudiante();
        // Se asignan los valores con el metodo setAlumno
        alumno.setAlumno("Matias", "Alvarez Mesegues", "1 A", 7);
        // Se muestra informacion
        alumno.getInfo();
        // Se modifica calificacion hacia arriba
        alumno.subirCalificacion(2);
        // Se muestra informacion actualizada
        alumno.getInfo();
        // Se modifica calificacion hacia abajo
        alumno.bajarCalificacion(5);
        // Se muestra informacion actualizada
        alumno.getInfo();
    }

}
