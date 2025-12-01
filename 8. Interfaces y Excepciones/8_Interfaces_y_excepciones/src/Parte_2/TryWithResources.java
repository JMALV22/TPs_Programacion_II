
package Parte_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

   public static void main(String[] args) {

        String ruta = "datos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Hubo un problema leyendo el archivo: " + e.getMessage());
        }
    }
}
