
package Parte_2;

import java.util.Scanner;

public class ValidarEdad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresá la edad: ");
        int edad = sc.nextInt();

        try {
            validarEdad(edad);
            System.out.println("Edad válida: " + edad);

        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
        }
    }
}