
package ejercicio_05;

public class Computadora {
    
    private String marca;
    private int numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, int numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }
    
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
    }
    
    public Propietario getPropietario() {
        return propietario;
    }
    
    public void mostrarPc(){
        if(propietario != null){
            System.out.println("Datos de PC:\nMarca: " + marca + "\nNumero de serie: "
            + numeroSerie + "\nPlaca madre: " + placaMadre.motrarDatos() + "\nPropietario: "
            + propietario.mostrarDatosPropietario());
        } else{
            System.out.println("Datos de PC:\nMarca: " + marca + "\nNumero de serie: "
            + numeroSerie + "\nPlaca madre: " + placaMadre.motrarDatos() + "\nPropietario: "
            + "Sin propietario");
        }
    }
    
    public String mostrarDatosDePc(){
        return marca + " S/N " + numeroSerie + " con Placa Madre: " + placaMadre.getModelo();
    }

    public String getMarca() {
        return marca;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }
    
    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", placaMadre=" + placaMadre + '}';
    }
    
}
