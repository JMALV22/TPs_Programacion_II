
/*
TRABAJO PRACTICO N°4.
Alumno: ALVAREZ MESEGUES, Jose Matias
Comision: 18
*/

package trabajoPractico4;

public class trabajo_practico_4 {
    
    /*
    
    1. Implementar la clase Empleado aplicando todos los puntos anteriores.
    
    2. Crear una clase de prueba con método main que:
            ○ Instancie varios objetos usando ambos constructores.
            ○ Aplique los métodos actualizarSalario() sobre distintos empleados.
            ○ Imprima la información de cada empleado con toString().
            ○ Muestre el total de empleados creados con
              mostrarTotalEmpleados().      
    */
    
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado(01, "Matias", "Segundo Oficial", 1500);
        Empleado empleado2 = new Empleado("Carlos", "Comandante");
        Empleado empleado3 = new Empleado(02, "Jose", "Tercer Oficial", 1000);
        Empleado empleado4 = new Empleado("Pepe", "Cocinero");
        
        // SE REALIZA ACTUALIZACION DE SALARIO DEL PRIMER EMPLEADO
        empleado1.actualizaSalario();

        empleado1.mostraDatosEmpleado();
        
        // SE REALIZA ACTUALIZACION DE SALARIO DEL SEGUNDO EMPLEADO 
        // CON SEGUNDO METODO SOBRECARGADO
        empleado2.actualizaSalario(10);
        
        empleado2.mostraDatosEmpleado();
        
        // SE MUESTRA EL TOTAL DE EMPLEADOS AL MOMENTO
        empleado1.mostrarTotalEmpleados();
        
        // SE MUESTRA CON toString()
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);

    }

}
