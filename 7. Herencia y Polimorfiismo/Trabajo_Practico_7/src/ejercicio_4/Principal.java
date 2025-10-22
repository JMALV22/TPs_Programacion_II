
package ejercicio_4;


public class Principal {

    public static void main(String[] args) {
        
        Animal perro = new Perro("Labrador", 2, "Alus");
        Animal gato = new Gato("Mediano", "Siames", "Pepe");
        Animal vaca = new Vaca(true, "Vaquita");
        Animal vaca2 = new Vaca(false, "Vaquita loca");
        
        perro.describirAnimal();
        System.out.println("---------------");
        perro.hacerSonido();
        System.out.println("||||||||||||||||");
        gato.describirAnimal();
        System.out.println("---------------");
        gato.hacerSonido();
        System.out.println("||||||||||||||||");
        vaca.describirAnimal();
        System.out.println("---------------");
        vaca.hacerSonido();
        System.out.println("||||||||||||||||");
        vaca2.describirAnimal();
        System.out.println("---------------");
        vaca2.hacerSonido();
  
    }

}
