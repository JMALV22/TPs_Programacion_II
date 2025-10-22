
package ejercicio_3;

public abstract class Empleado {
    
    private final double DESC_OBRA_SOCIAL = 0.015;
    private final double DESC_JUBILATORIO = 0.11;
    private String nombre_Apellido;
    private double sueldoBasico_por_mes;

    public Empleado(String nombre_apellido, double sueldoBasico) {
        this.nombre_Apellido = nombre_apellido;
        this.sueldoBasico_por_mes = sueldoBasico;
    }

    public void calcularSueldo(){ 
        
    }
    
    public double sueldoPorMes(){
        double sueldoPorMes = sueldoBasico_por_mes
                - (sueldoBasico_por_mes*DESC_JUBILATORIO)
                - (sueldoBasico_por_mes*DESC_OBRA_SOCIAL);
        return sueldoPorMes;
    }

    public double getDESC_OBRA_SOCIAL() {
        return DESC_OBRA_SOCIAL;
    }

    public double getDESC_JUBILATORIO() {
        return DESC_JUBILATORIO;
    }

    public String getNombre_Apellido() {
        return nombre_Apellido;
    }

    public double getSueldoBasico_por_mes() {
        return sueldoBasico_por_mes;
    }
    
}
