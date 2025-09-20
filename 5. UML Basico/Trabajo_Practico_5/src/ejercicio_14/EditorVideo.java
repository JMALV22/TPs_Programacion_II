
package ejercicio_14;

public class EditorVideo {
    
    public void exportar(String formato,Proyecto proyecto){
        
        Render video = new Render(formato);
        video.setProyecto(proyecto);
        
        System.out.println("Proyecto: " + proyecto.mostrarDatosProyecto()
                          + "\n*** Se realiza formato ***" 
                          + "\nFormato: " + video.getFormato());
        
    }
    
}
