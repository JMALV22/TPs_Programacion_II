
package ejercicio_09;

public class Principal {

    public static void main(String[] args) {
        
        Paciente federico = new Paciente("Federico", "OSDE.210");
        Profecional clinico = new Profecional("Matias", "Medico Clinico");
        
        CitaMedica enero020925 = new CitaMedica("02/09/2025", "15:15");
        
        enero020925.mostrarCitaMedica();
        System.out.println("");
        
        enero020925.setPaciente(federico);
        enero020925.mostrarCitaMedica();
        enero020925.setPaciente(null);
        System.out.println("");
        
        enero020925.setProfecional(clinico);
        enero020925.mostrarCitaMedica();
        System.out.println("");
        
        enero020925.setPaciente(federico);
        enero020925.mostrarCitaMedica();
        
    }

}
