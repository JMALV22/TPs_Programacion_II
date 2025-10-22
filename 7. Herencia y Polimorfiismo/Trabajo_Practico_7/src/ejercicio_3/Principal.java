
package ejercicio_3;

import ejercicio_2.Figura;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
        // Creamos el ArrayList de figuras:
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        Empleado empleadoTemporal_01 = new EmpleadoTemporal(95, "Jose Pepe", 1000);
        Empleado empleadoPlanta_01 = new EmpleadoPlanta(10, "Carlos Morales",2000);
        Empleado empleadoPlanta_02 = new EmpleadoPlanta(5, "Jorge Robles",2000);
        Empleado empleadoPlanta_03 = new EmpleadoPlanta(12, "Anibal Pelin",2000);
        
        empleadoPlanta_01.calcularSueldo();
        System.out.println("-------------------------");
        empleadoTemporal_01.calcularSueldo();
        System.out.println("-------------------------");
        empleadoPlanta_02.calcularSueldo();
        System.out.println("-------------------------");
        empleadoPlanta_03.calcularSueldo();
        System.out.println("\n-------------------------\n");
        
        agregarFigura(empleadoPlanta_01, empleados);
        agregarFigura(empleadoTemporal_01, empleados);
        agregarFigura(empleadoPlanta_02, empleados);
        agregarFigura(empleadoPlanta_02, empleados);
        
        mostrarCantidadEmplePlanta(empleados);
        
    }
    
    public static void agregarFigura(Empleado empleado, ArrayList listEmpleados){
        listEmpleados.add(empleado);
    }
    
    public static void mostrarCantidadEmplePlanta(ArrayList<Empleado> empleados){
        int i = 0;
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta){
                i++;
            }
        }
        System.out.println("Hay " + i + " empleados de Planta");
    }

}
