
package ejercicio_4;

public class Perro extends Animal{

    private String raza;
    private int edad;
    
    public Perro(String raza, int edad, String nombre) {
        super(nombre);
        this.raza = raza;
        this.edad = edad;
    }
    
    @Override
    public void describirAnimal(){
        System.out.println("Amimal: " + getNombre()
        + "\nRaza: " + raza
        + "\nEdad: " + edad);
    }
            
    @Override
    public void hacerSonido(){
        System.out.println("GUAUU GUAUUUUUUUU  GUAUUUUU");
    }
    
}
