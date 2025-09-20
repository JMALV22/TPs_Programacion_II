
package ejercicio_07;

public class Vehiculo {
     
    private String patente;
    private String modelo;
    private Conductor conductor;    // Asignacion bidireccional
    private Motor motor;            // Agregacion

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void setConductor(Conductor conductor){
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }

    public Conductor getConductor() {
        return conductor;
    }
    
    public void datosVehiculo(){
        if (conductor != null){
            System.out.println("Vehiculo con patente " + patente
        + ", modelo: " + modelo
        + "\nMotor: " + motor.mostraDatosMotor()
        + "\nConductor: " + conductor.mostrarDatosPersonales());
        } else {
            System.out.println("Vehiculo con patente " + patente
        + ", modelo: " + modelo
        + "\nMotor: " + motor.mostraDatosMotor()
        + "\nConductor: No asignado");
        }
    }
    
    public String mostraDatosVehiculo(){
        return "Patente: " + patente 
                + "\nModelo " + modelo 
                + "\nMotor " + motor.mostraDatosMotor();
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + '}';
    }
    
}

