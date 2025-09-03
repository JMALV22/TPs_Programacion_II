
package Trabajo_Practico_2;

import java.util.Scanner;

public class Utils {
    
    static int ValidarDatoPosiInt(int a){
    Scanner input = new Scanner(System.in);
        while (a <= 0) {
            System.out.print("ERROR. Ingrese un numero positivo: ");
            a = Integer.parseInt(input.nextLine());
        }
        return a;
    }
    
    static double ValidarDatoPosiDoub(double a){
    Scanner input = new Scanner(System.in);
        while (a <= 0) {
            System.out.print("ERROR. Ingrese un numero positivo: ");
            a = Double.parseDouble(input.nextLine());
        }
        return a;
    }
    
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal;
        impuesto = impuesto / 100;
        descuento = descuento / 100;
        precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
    
    static double calcularCostoEnvio(double peso, char zona) {
        double costoEnvio = 0;
        if (zona == 'N') {
            costoEnvio = peso * 5; 
        } else if (zona == 'I') {
            costoEnvio = peso * 10; 
        }
        return costoEnvio;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double totalAPagar;
        totalAPagar = precioProducto + costoEnvio;
        return totalAPagar;
    }
    
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        
        int nuevoStock = 0;
        
        nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
         
        return nuevoStock;
    }
}
