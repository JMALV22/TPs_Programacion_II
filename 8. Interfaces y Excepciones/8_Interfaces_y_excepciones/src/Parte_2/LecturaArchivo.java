
package Parte_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {

    public static void main(String[] args) {

        try {
            File archivo = new File("datos.txt");
            Scanner sc = new Scanner(archivo);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe o no se puede abrir.");
        }
    }

}
