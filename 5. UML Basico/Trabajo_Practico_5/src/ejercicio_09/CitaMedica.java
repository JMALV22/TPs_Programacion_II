
package ejercicio_09;

public class CitaMedica {
    
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profecional profecional;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public void mostrarCitaMedica(){
        if (paciente == null && profecional != null){
           System.out.println("Cita medica:\nFecha: " + fecha + " / Hora: " + hora
            + "\nPaciente: Sin paciente asignado"
            + "\nProfecional: " + profecional.mostrarDatosProfecional()); 
        } else if (paciente != null && profecional == null){
            System.out.println("Cita medica:\nFecha: " + fecha + " / Hora: " + hora
            + "\nPaciente: " + paciente.mostrarDatosPersonales()
            + "\nProfecional: Sin profecional asignado"); 
        } else if (profecional == null && paciente == null){
            System.out.println("Cita medica:\nFecha: " + fecha + " / Hora: " + hora
            + "\nPaciente: Sin paciente asignado"
            + "\nProfecional: Sin profecional asignado"); 
        } else {
            System.out.println("Cita medica:\nFecha: " + fecha + " / Hora: " + hora
            + "\nPaciente: " + paciente.mostrarDatosPersonales()
            + "\nProfecional: " + profecional.mostrarDatosProfecional());
        }
        
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profecional getProfecional() {
        return profecional;
    }

    public void setProfecional(Profecional profecional) {
        this.profecional = profecional;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", profecional=" + profecional + '}';
    }

}


