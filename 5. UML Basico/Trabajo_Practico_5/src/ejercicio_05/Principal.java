
package ejercicio_05;

public class Principal {

    public static void main(String[] args) {
        
        Propietario carlos = new Propietario("Carlos", 32165498);
        Computadora asus1000 = new Computadora("ASUS-1000", 456789, "Asus XS23", "TSDU 1000");
        
        asus1000.mostrarPc();
        carlos.setComputadora(asus1000);
        System.out.println("");
        asus1000.mostrarPc();
        
        System.out.println("");
        
        carlos.mostrarPropietario();

    }

}
