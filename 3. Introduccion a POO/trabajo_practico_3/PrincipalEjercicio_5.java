
/*
TRABAJO PRACTICO N°3.
Alumno: ALVAREZ MESEGUES, Jose Matias
Comision: 18
*/

// 5. Simulación de Nave Espacial

package trabajo_practico_3;

public class PrincipalEjercicio_5 {

    public static void main(String[] args) {
        
        /*
        a. Crear una clase NaveEspacial con los atributos: nombre, combustible.
        Métodos requeridos: : despegar(), avanzar(distancia),
        recargarCombustible(cantidad), mostrarEstado().
        Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que
        se supere el límite al recargar
        Tarea: : Crear una nave con 50 unidades de combustible, intentar avanzar sin
        recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.
        */
        
        // Se crea la nave
        NaveEspacial starship = new NaveEspacial();
        // Se asignan los valores
        starship.setNaveEspacial("Starship", 50);
        
        // Se muestra estado
        starship.mostrarEstado();
        
        // Se avanza las millas puestas
        starship.avanzar(500);
        
        // Se muestra estado
        starship.mostrarEstado();
        
        //Se recarga combustible
        starship.recargar();
        
        // Se muestra estado
        starship.mostrarEstado();
    }

}
