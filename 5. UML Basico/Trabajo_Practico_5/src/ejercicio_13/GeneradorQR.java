
package ejercicio_13;

public class GeneradorQR {
    
    public void generar(String valor,Usuario usuario){
        
        CodigoQR menu = new CodigoQR(valor);
        menu.setUsuario(usuario);
        
        System.out.println("Usuario: " + menu.getUsuario().mostrarUsuario()
                          + "\nSe genero codigo QR" 
                          + "\nValor: " + menu.getValor());
        
    }
    
}
