
package trabajo_practico_1;

import java.util.Scanner;

public class ejercicio_5 {
    
    /* Escribe un programa que solicite dos números enteros y realice las 
       siguientes operaciones:
        a. Suma
        b. Resta
        c. Multiplicación
        d. División
       Muestra los resultados por pantalla.
    */

    public static void main(String[] args) {
        // Insertamos el objeto tipo Scanner e importamos la clase
        Scanner input = new Scanner(System.in);
        
        // Definimos las variables
        int numero1, numero2, suma, resta, multipli, division;
        
        System.out.print("Ingrese el primer número: ");
        numero1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número: ");
        numero2 = Integer.parseInt(input.nextLine());
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multipli = numero1 * numero2;
        division = numero1 / numero2;
        
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multipli);
        System.out.println(division);
       
    }

}
