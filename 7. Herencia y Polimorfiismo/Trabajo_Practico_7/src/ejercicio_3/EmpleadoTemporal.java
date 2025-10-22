
package ejercicio_3;

public class EmpleadoTemporal extends Empleado{

    private int dias_trabajados;

    public EmpleadoTemporal(int dias_trabajados, String nombre_apellido, double sueldoBasico) {
        super(nombre_apellido, sueldoBasico);
        this.dias_trabajados = dias_trabajados;
    }
    
    @Override
    public void calcularSueldo(){
        double sueldo_a_cobrar = 0;
        sueldo_a_cobrar = (dias_trabajados * sueldoPorMes())/30;
        System.out.println("Categoria: Empleado temporal\nNombre y Apellido: "
        + getNombre_Apellido()
        + "\nDias trabajados: " + dias_trabajados        
        + "\nSueldo a cobrar: " + sueldo_a_cobrar);
    }

    @Override
    public String toString() {
        return "EmpleadoTemporal{" + "NombreYApellido=" + getNombre_Apellido() + "dias_trabajados=" + dias_trabajados + '}';
    }
  
}
