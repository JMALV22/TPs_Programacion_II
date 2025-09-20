
package ejercicio_12;

public class Calculadora {
    
    private final double COEFICIENTE_FINAL = 0.01; 
    
    public void calcular(Impuesto impuesto){
        double monto_final = impuesto.getMonto() * COEFICIENTE_FINAL + impuesto.getMonto();
        impuesto.mostrarDatoImpuesto();
        System.out.println("\nEl impuesto final a pagar es de:\n" + monto_final);
    }

}
