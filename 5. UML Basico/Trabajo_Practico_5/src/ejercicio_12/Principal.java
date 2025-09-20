
package ejercicio_12;

public class Principal {

    public static void main(String[] args) {
        
        Contribuyente matias = new Contribuyente("Matias", "0-12345678-9");
        Impuesto A05 = new Impuesto(200);
        Calculadora calculadoraA05 = new Calculadora();
        
        A05.setContribuyente(matias);
       
        calculadoraA05.calcular(A05);
 
    }

}
