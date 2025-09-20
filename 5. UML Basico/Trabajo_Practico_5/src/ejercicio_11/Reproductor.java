
package ejercicio_11;

public class Reproductor {
    
    public void reproducir(Cancion cancion){
        System.out.println("El reproducto esta reproduciondo:\nCancion: " 
        + cancion.getTitulo()
        + "\nArtista: " + cancion.getArtista().getNombre());
   
    }
    
}
