
package ejercicio_12;

public class Impuesto {
    
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto;
    }
    
    public void mostrarDatoImpuesto(){
        System.out.println("El impuesto a pagar es de:\nMonto: " 
        + monto + "\nContribuyente: " + contribuyente.mostrarDatosPersonales());
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }
    
}
