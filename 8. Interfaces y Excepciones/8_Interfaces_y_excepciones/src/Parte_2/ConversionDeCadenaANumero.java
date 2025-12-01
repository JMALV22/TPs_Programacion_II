
package Parte_2;

import java.util.Scanner;

public class ConversionDeCadenaANumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Numero ingresado: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("No ingresaste un numero valido.");
        }
    }

}
