
package trabajo_practico_3;

import java.util.Scanner;

public class NaveEspacial {
    
     
    private final static double FACTOR_CONSU_COMBU = 0.025; // CONSUMO: 5 unidades cada 200 millas (5/200)
    private final static double MAX_COMBU_ADMITIDO = 50;
    private final static double MAX_DISTA_PERMITIDA = 2000; // Distancia en MILLAS
    private final static double FACTOR_SEG = 0.10;
    
    private String nombre;
    private double combustible;
    
    public void setNaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + "\nCant. de combustible: " + combustible + "\n");
    }
    
    public void avanzar(int distancia) {
        double consumo = distancia * FACTOR_CONSU_COMBU; // Calculo de consumo segun distancia
        if (consumo > combustible) {
            System.out.println("NO SE PUEDE AVANZAR. Consumo mayor al admitido");
            
        } else if ((combustible -= consumo) < (MAX_COMBU_ADMITIDO * FACTOR_SEG)) { 
            // MAX_COMBU_ADMITIDO * FACTOR_SEG = 10% de 50 unidades de combustible.
            System.out.println("PELIGRO, Se debe cargar combustible\n");
            
        } else { // Variable combustible actualizada en 'else if', con la cantidad al avanzar.
            System.out.println("Combustible restante: " + combustible);
            double distancia_remanete = MAX_DISTA_PERMITIDA - (consumo / FACTOR_CONSU_COMBU);
            System.out.println("Queda para recorrer (en millas) : " + distancia_remanete + "\n");
        }
    }
    
    public void recargar() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i == 0) {
            System.out.print("Cant. de combustible a cargar: ");
            double cantidadCombu = Integer.parseInt(input.nextLine());
            
            if (combustible == MAX_COMBU_ADMITIDO) {
                System.out.println("El tanque esta completo");
                i = 1;
            } else if ((combustible + cantidadCombu) > MAX_COMBU_ADMITIDO) {
                System.out.println("No se puede cargar esa cantidad, supera el maximo");
                i = 0;
            } else {
                combustible += cantidadCombu;
                System.out.println("Combustible actual: " + combustible + "\n");
                i = 1;
            }
        }
    }
}
