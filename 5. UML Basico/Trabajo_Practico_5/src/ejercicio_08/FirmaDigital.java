
package ejercicio_08;

public class FirmaDigital {
    
    private String codigoHash;
    private String fecha;
    private Usuario usuario;      // Agregacion  1:1

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    
    public String mostrarDatosFirmaDig(){
        return codigoHash + " / " + fecha + " / " + "\nUsuario: " + usuario.mostrarDatos();
    }

    public String getCodigHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + '}';
    }
    
    
  
}
