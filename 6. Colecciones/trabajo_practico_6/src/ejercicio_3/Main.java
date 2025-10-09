
package ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("\nPunto 1) del ejercicio:");
        System.out.println("Crear al menos 3 profesores y 5 cursos.");
        
        Profesor carlos    = new Profesor("CAR1234", "Carlos Alvarez", "Matematico");
        Profesor javier    = new Profesor("JAV5678", "Javier Tolueno", "Astrofisico");
        Profesor guillermo = new Profesor("GUI4321", "Guillermo Pepe", "Calculos Avanzados");
        
        Curso matematicas7   = new Curso("MAT7-123", "Matematicas 7");
        Curso fisicaSuperior = new Curso("FISS-456", "Fisica Superior");
        Curso calculosMate   = new Curso("CALM-789", "Calculos Matematicos");
        Curso astroFisica    = new Curso("ASTF-999", "Astro Fisica");
        Curso panaderiaAva   = new Curso("PANA-000", "Panaderia Avanzada");
        
        System.out.println("\nPunto 2) del ejercicio:");
        System.out.println("Agregar profesores y cursos a la universidad.");
        
        Universidad sedPalermo = new Universidad("Sede Palermo");
        
        sedPalermo.agregarProfesor(carlos);
        sedPalermo.agregarProfesor(javier);
        sedPalermo.agregarProfesor(guillermo);
        
        sedPalermo.agregarCurso(matematicas7);
        sedPalermo.agregarCurso(fisicaSuperior);
        sedPalermo.agregarCurso(calculosMate);
        sedPalermo.agregarCurso(astroFisica);
        sedPalermo.agregarCurso(panaderiaAva);
        
        System.out.println("\nPunto 3) del ejercicio:");
        System.out.println("Asignar profesores a cursos usando asignarProfesorACurso(...)");
        
        sedPalermo.asignarProfesorACurso("MAT7-123", "CAR1234");
        sedPalermo.asignarProfesorACurso("FISS-456", "JAV5678");         
        sedPalermo.asignarProfesorACurso("CALM-789", "GUI4321");            
        sedPalermo.asignarProfesorACurso("ASTF-999", "JAV5678");              
        sedPalermo.asignarProfesorACurso("PANA-000", "GUI4321");      
        
        System.out.println("\nPunto 4) del ejercicio: +++++++++++++++++++++");
        // Listar cursos con su profesor y profesores con sus cursos.
        
        sedPalermo.listarProfesores();
        sedPalermo.listarCursos();
        
        System.out.println("\nPunto 5) del ejercicio: +++++++++++++++++++++");
        // Cambiar el profesor de un curso y verificar que ambos lados 
        // quedan sincronizados.
        
        sedPalermo.asignarProfesorACurso("PANA-000", "JAV5678");
        
        sedPalermo.listarProfesores();
        sedPalermo.listarCursos();
        
        System.out.println("\nPunto 6) del ejercicio: +++++++++++++++++++++");
        // Remover un curso y confirmar que ya no aparece en la 
        // lista del profesor.
        
        sedPalermo.eliminarCurso("PANA-000");
        
        sedPalermo.listarProfesores();
        sedPalermo.listarCursos();
        
        System.out.println("\nPunto 7) del ejercicio: +++++++++++++++++++++");
        // Remover un profesor y dejar profesor = null
        
        sedPalermo.eliminarProfesor("GUI4321");
        
        sedPalermo.listarProfesores();
        sedPalermo.listarCursos();
        
        System.out.println("\nPunto 8) del ejercicio: +++++++++++++++++++++");
        // Mostrar un reporte: cantidad de cursos por profesor.
        
        sedPalermo.listarProfesores();
    }
}
