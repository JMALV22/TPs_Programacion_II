

package trabajo_practico_1;

import java.util.Scanner;

public class ejercicio_4 {
    
    /* Crea un programa que solicite ingresar su nombre y edad, y luego los
       muestre por pantalla. Usa Scanner para capturar los datos.
    */

    public static void main(String[] args) {
        // Insertamos el objeto tipo Scanner e importamos la clase
        Scanner input = new Scanner(System.in);
        
        // Definimos las variables
        String nombre;
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: " + edad + " años");
    }

}
