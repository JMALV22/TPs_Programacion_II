
package ejercicio_10;

public class CuentaBancaria {
    
    private String cbu;
    private String saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, String saldo, String codigo, String ultModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultModificacion);
    }
    
    public void setTitular(Titular titular){
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this){
            titular.setCuentaBancaria(this);
        }
    }
    
    public void mostrarCuenta(){
        System.out.println("Datos de cuenta bancaria:\n"
        + "Titular: " + titular.datosTitular()
        + "\nSaldo: " + saldo
        + "\nClave de seguridad: " + claveSeguridad.mostrarClave());
    }
    
    public Titular getTitular() {
        return titular;
    }

    public String getCbu() {
        return cbu;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", claveSeguridad=" + claveSeguridad + ", titular=" + titular + '}';
    }
  
}