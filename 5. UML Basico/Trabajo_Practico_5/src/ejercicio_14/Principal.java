
package ejercicio_14;

public class Principal {

    public static void main(String[] args) {
        
        Proyecto explicacion_ejercicio = new Proyecto("Explicacion - ejercicio 5", 5.20);
        
        EditorVideo formato_final = new EditorVideo();
        
        formato_final.exportar(".mp4", explicacion_ejercicio);
 
    }
    
}

