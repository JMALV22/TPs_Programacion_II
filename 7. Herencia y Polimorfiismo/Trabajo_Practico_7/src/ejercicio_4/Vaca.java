
package ejercicio_4;

public class Vaca extends Animal{

    private boolean esLechera;

    public Vaca(boolean esLechera, String nombre) {
        super(nombre);
        this.esLechera = esLechera;
    }

    
    @Override
    public void describirAnimal(){
        String lechera = "";
        if (esLechera){
            lechera = "Si";
        } else {
            lechera = "No";
        }
        System.out.println("Amimal: " + getNombre()
        + "\nEs lechera: " + lechera);
    }
            
    @Override
    public void hacerSonido(){
        System.out.println("MUUUUUUUUUUUU MMUUUUUUUUUU");
    }
    
    
}


