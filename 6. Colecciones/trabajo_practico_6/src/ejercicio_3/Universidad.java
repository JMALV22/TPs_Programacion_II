
package ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p){
        if(!profesores.contains(p)){
            profesores.add(p);    
        } else {
            System.out.println("El profesor " + p
            + " ya pertenece a la universidad");  
        }
    }
    
    public void agregarCurso(Curso c){
        if(!cursos.contains(c)){
            cursos.add(c);    
        } else {
            System.out.println("El curso " + c
            + " ya se encuentra en la universidad");  
        }
    }
    
    // Mediante esta funcion asiganmos el profesor al curso,
    // primero buscamos el profesor con su id y lo guardamos en una variable,
    // luego buscamos el curso de la misma forma, y por ultimo agregamos
    // el profesor al curso mediante el setProfesor().
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Profesor profesorAsiganar = null;
        int i = 0;
        while (profesorAsiganar == null && i < profesores.size()){
            if(profesores.get(i).getId().equalsIgnoreCase(idProfesor)){
                profesorAsiganar = profesores.get(i);
            }
            i++;
        }
        Curso cursoAsignar = null;
        int y = 0;
        while (cursoAsignar == null && y < cursos.size()){
            if(cursos.get(y).getCodigo().equalsIgnoreCase(codigoCurso)){
                cursoAsignar = cursos.get(y);
            }
            y++;
        }
        if (cursoAsignar != null){
            if (profesorAsiganar != null){
                cursoAsignar.setProfesor(profesorAsiganar);
            } else {
                System.out.println("El profesor no existe");
            }
        } else {
            System.out.println("El curso no existe");
        }
        
    }
    
    public void listarProfesores(){
        System.out.println("Los profesores de la Universidad, son: \n");
        for (Profesor profesor : profesores){
            profesor.mostrarInfo();
            System.out.println("Cursos dictados: ");
            profesor.listarCursos();
            System.out.println("-----------------------------------------");
        }
    } 
    
    //En este metodo, utilizamos un metodo privado para buscar el profesor que tiene 
    // cada curso. Mediante un for se recorre la lista de cursos y se va asigando
    // su profesor por medio del metodo buscarProfesorDeUnCurso();
    public void listarCursos(){
        System.out.println("\nLos cursos de la Universidad, son:");
        for (Curso curso : cursos){
            curso.mostrarInfo();
            if(buscaProfesorDeUnCurso(curso) != null){
                System.out.println("Profesor que dicta el curso: ");
                System.out.println("-> " + buscaProfesorDeUnCurso(curso).getNombre());    
            } else {
                System.out.println("El curso no tiene asignado profesores.");
            }
            System.out.println("-----------------------------------------");
        }
        
    }
    
    public void buscarProfesorPorId(String id){
        Profesor profesorBuscado = null;
        int i = 0;
        while (profesorBuscado == null && i < profesores.size()){
            if(profesores.get(i).getId().equalsIgnoreCase(id)){
                profesorBuscado = profesores.get(i);
            }
            i++;
        }
        if (profesorBuscado != null){
            System.out.println("El profesor buscado con el ID " + id 
            + " es: " + profesorBuscado.getNombre());
        } else {
            System.out.println("No existe profesor con el ID " + id);
        }  
    }
    
    public void buscarCursoPorCodigo(String codigo){
        Curso cursoBuscado = null;
        int i = 0;
        while (cursoBuscado == null && i < cursos.size()){
            if(cursos.get(i).getCodigo().equalsIgnoreCase(codigo)){
                cursoBuscado = cursos.get(i);
            }
            i++;
        }
        if (cursoBuscado != null){
            System.out.println("El curso buscado con el Codigo " + codigo 
            + " es: " + cursoBuscado.getCodigo());
        } else {
            System.out.println("No existe profesor con el ID " + codigo);
        } 
    }
    
    public void eliminarCurso(String codigo){
        Curso cursoBuscado = null;
        int i = 0;
        while (cursoBuscado == null && i < cursos.size()){
            if(cursos.get(i).getCodigo().equalsIgnoreCase(codigo)){
                cursoBuscado = cursos.get(i);
                cursos.remove(cursos.get(i));
            }
            i++;
        }
        buscaProfesorDeUnCurso(cursoBuscado).eliminarCurso(cursoBuscado);
    }
    
    public void eliminarProfesor(String id){
        Profesor profesorBuscado = null;
        int i = 0;
        while (profesorBuscado == null && i < profesores.size()){
            if(profesores.get(i).getId().equalsIgnoreCase(id)){
                profesorBuscado = profesores.get(i);
                profesores.remove(profesores.get(i));
            }
            i++;
        }
    }
    
    private Profesor buscaProfesorDeUnCurso(Curso curso){
        Profesor profesoresEnc = null;
        for(Profesor profe : profesores){
            if(profe.getCurso().contains(curso)){
                profesoresEnc = profe;
            }
        }
        return profesoresEnc;
    }
 
}
