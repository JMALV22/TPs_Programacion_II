
package ejercicio_10;

public class Principal {

    public static void main(String[] args) {
        
        CuentaBancaria bbva = new CuentaBancaria("356542888415566", "1000", "aabb1122", "03/09/2024");
        Titular juen = new Titular("Juna", 95482125);
        
        bbva.setTitular(juen);
        
        bbva.mostrarCuenta();
        
        
        

    }

}
