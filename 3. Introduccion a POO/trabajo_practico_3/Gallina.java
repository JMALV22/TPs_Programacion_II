
package trabajo_practico_3;

import java.util.Scanner;

public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    public void mostrarEstado() {
        System.out.println("Identificador de Gallina: " + idGallina + "\nEdad: " + edad + "\nHuevos puestos: " + huevosPuestos);
    }
    
    public void agregarGallina() {
        Scanner input = new Scanner(System.in);
        System.out.print("Datos para nueva Gallina\nIdentificador: ");
        idGallina = input.nextLine();
        System.out.print("Edad: ");
        edad = Integer.parseInt(input.nextLine());
        System.out.print("Cant. de huevos puestos: ");
        huevosPuestos = Integer.parseInt(input.nextLine());
    }
    
    public void setGallina() {
        int i;
        do {    
            Scanner input = new Scanner(System.in);
            System.out.println("Seleccione la opcion deseada:");
            System.out.println("1) edad\n2) Huevos puestos\n3) Salir");
            i = Integer.parseInt(input.nextLine());
        
            if (i == 1) {
                System.out.print("Anios a sumar: ");
                int aniosSumar = Integer.parseInt(input.nextLine());
                envejecer(aniosSumar);
               
            } else if (i == 2) {
                System.out.print("Cant. de huevos puestos: ");
                int nuevosHuevos = Integer.parseInt(input.nextLine());
                ponerHuevo(nuevosHuevos);
            }
        } while (i != 3);
    }
    
    
    public void ponerHuevo(int nuevosHuevosPuestos) {
        if (nuevosHuevosPuestos >= 0) {
            huevosPuestos += nuevosHuevosPuestos;
        } else if (nuevosHuevosPuestos < 0) {
            System.out.println("Error de dato ingresado");
        }
    }
        
    public void envejecer(int anios) {
        if (anios >= 0) {
            edad += anios;
        } else if (anios < 0) {
            System.out.println("Error de dato ingresado");
        }   
    }
}
