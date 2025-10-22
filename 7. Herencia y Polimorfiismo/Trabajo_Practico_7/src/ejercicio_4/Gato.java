
package ejercicio_4;

public class Gato extends Animal{
    
    private String raza;
    private String tamaño;
    
    public Gato(String tamaño, String raza, String nombre) {
        super(nombre);
        this.raza = raza;
        this.tamaño = tamaño;
    }
    
    @Override
    public void describirAnimal(){
        System.out.println("Amimal: " + getNombre()
        + "\nRaza: " + raza
        + "\nTamaño: " + tamaño);
    }
      
    @Override
    public void hacerSonido(){
        System.out.println("miauuuuuuuuuuuu...");
    }
    
    
    
}

