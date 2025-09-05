
/*
TRABAJO PRACTICO N°3.
Alumno: ALVAREZ MESEGUES, Jose Matias
Comision: 18
*/

// 2. Registro de Mascotas

package trabajo_practico_3;

public class PrincipalEjercicio_2 {
    
    public static void main(String[] args) {
        
        /*
        a. Crear una clase Mascota con los atributos: nombre, especie, edad.
        Métodos requeridos: mostrarInfo(), cumplirAnios().
        Tarea: Crear una mascota, mostrar su información, simular el paso 
        del tiempo y verificar los cambios.
        */
        
        Mascota perro = new Mascota();

        perro.setMascota("Albus", "Labrador", 1);
        
        perro.mostrarInfo();
        
        perro.cumplirAnios(1);
        
        perro.mostrarInfo();
    }

}
