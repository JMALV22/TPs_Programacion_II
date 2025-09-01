
package trabajo_practico_1;

import java.util.Scanner;

public class ejercicio_8 {
    
    /* Manejar conversiones de tipo y división en Java.
        a. Escribe un programa que divida dos números enteros ingresados 
        por el usuario.
        b. Modifica el código para usar double en lugar de int y compara 
        los resultados.
    */

    public static void main(String[] args) {
        // Insertamos el objeto tipo Scanner e importamos la clase
        Scanner input = new Scanner(System.in);
        
        // Definimos las variables
        int numero1, numero2, resulDivInt;
        double resulDivDouble;
        
        System.out.print("Ingrese el primer número: ");
        numero1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        numero2 = Integer.parseInt(input.nextLine());
        
        resulDivInt = numero1 / numero2;
        resulDivDouble = (double) numero1 / (double) numero2;
        
        System.out.println("División de numeros Int: " + resulDivInt);
        System.out.println("División de numeros Double: " + resulDivDouble);
       
    }

}
