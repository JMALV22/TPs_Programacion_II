
package ejercicio_13;

public class Principal {

    public static void main(String[] args) {
        
        Usuario jose = new Usuario("Jose", "xxxxxQgmail.com");
        GeneradorQR restauran = new GeneradorQR();
        
        restauran.generar("4582261", jose);
 
    }
    
}
