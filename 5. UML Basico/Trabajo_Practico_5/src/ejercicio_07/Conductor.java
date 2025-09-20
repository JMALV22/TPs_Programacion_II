
package ejercicio_07;

public class Conductor {
    
    private String conductor;
    private String licencia;
    private Vehiculo vehiculo;     // Asignacion bidireccional

    public Conductor(String conductor, String licencia) {
        this.conductor = conductor;
        this.licencia = licencia;
    }
    
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this){
            vehiculo.setConductor(this);
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    public void datosConductor(){
        if (conductor != null){
            System.out.println("El conductor " + conductor
        + ", con licencia: " + licencia
        + "\nVehiculo asignado:\n" + vehiculo.mostraDatosVehiculo());
        }
    }
    
    public String mostrarDatosPersonales(){
        return conductor + " - Licencia: " + licencia;
    }

    public String getConductor() {
        return conductor;
    }

    public String getLicencia() {
        return licencia;
    }

    @Override
    public String toString() {
        return "Conductor{" + "conductor=" + conductor + ", licencia=" + licencia + '}';
    }

}
