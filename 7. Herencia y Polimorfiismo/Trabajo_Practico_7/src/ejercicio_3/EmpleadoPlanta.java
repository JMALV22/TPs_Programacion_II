
package ejercicio_3;

public class EmpleadoPlanta extends Empleado{
    
    final double COEF_POR_ANTIGUEDAD_POR_AÑO = 0.03;
    private int antiguedad;

    public EmpleadoPlanta(int antiguedad, String nombre_apellido, double sueldoBasico) {
        super(nombre_apellido, sueldoBasico);
        this.antiguedad = antiguedad;
    }
    
    @Override
    public void calcularSueldo(){
        double sueldo_a_cobrar = 0;
        double antiguedad_total = (antiguedad*COEF_POR_ANTIGUEDAD_POR_AÑO) * sueldoPorMes();
        sueldo_a_cobrar = sueldoPorMes() + antiguedad_total;
        System.out.println("Categoria: Empleado Planta\nNombre y Apellido: "
        + getNombre_Apellido()
        + "\nAntiguedad: " + antiguedad + " años."    
        + "\nSueldo a cobrar: " + sueldo_a_cobrar);
    }

    @Override
    public String toString() {
        return "EmpleadoPlanta{" + "NombreYApellido=" + getNombre_Apellido() + "antiguedad=" + antiguedad + '}';
    }
    
}
