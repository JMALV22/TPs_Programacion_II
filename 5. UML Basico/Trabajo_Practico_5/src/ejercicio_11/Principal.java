
package ejercicio_11;

public class Principal {

    public static void main(String[] args) {
        
        Artista cerati = new Artista("Gustavo Cerati", "Rock Nacional");
        Cancion en_la_ciudad_de_la_furia = new Cancion("En la ciudad de la furia");
        
        en_la_ciudad_de_la_furia.setArtista(cerati);
        
        System.out.println(en_la_ciudad_de_la_furia.mostrarDatosCancion());
        System.out.println("");
        
        Reproductor equipoDeMusica = new Reproductor();
        
        equipoDeMusica.reproducir(en_la_ciudad_de_la_furia);
  
    }

}
