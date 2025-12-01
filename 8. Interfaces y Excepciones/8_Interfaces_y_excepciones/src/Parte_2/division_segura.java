
package Parte_2;

import java.util.Scanner;

public class division_segura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer numero: ");
            int a = sc.nextInt();

            System.out.print("Ingresa el segundo numero: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        }
    }

}
