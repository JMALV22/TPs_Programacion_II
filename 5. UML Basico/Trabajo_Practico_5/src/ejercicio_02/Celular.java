
package ejercicio_02;

public class Celular {
    
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    public void getBateria(){
        if (bateria != null){
            System.out.println("El celular " + marca + " tiene una " + bateria);
        } else {
            System.out.println("El celular " + marca + " no tiene bateria");
        }
    }
    
    public void cambioNuevaBateria(Bateria bateria) {
        String bateriaVieja = this.bateria.getModelo();
        this.bateria = bateria;
        System.out.println("Se remplazo la bateria: " + bateriaVieja + " por la nueva bateria: " + this.bateria.getModelo());
          
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + '}';
    }
    
}
