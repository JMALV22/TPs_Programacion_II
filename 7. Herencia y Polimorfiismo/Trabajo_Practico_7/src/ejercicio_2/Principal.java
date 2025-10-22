
package ejercicio_2;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
        // Creamos el ArrayList de figuras:
        ArrayList<Figura> figuras = new ArrayList<>();
        
        // Ceamos las figuras:
        Figura circulo1 = new Circulo(5, "Ciculo 1");
        Figura rectangulo1 = new Rectangulo(2, 5, "Rectangulo 1");
        Figura circulo2 = new Circulo(2, "Ciculo 2");
        Figura rectangulo2 = new Rectangulo(4, 10, "Rectangulo 2");
        
        // Agregamos las figuras en el ArrayList:
        agregarFigura(circulo1, figuras);
        agregarFigura(rectangulo1, figuras);
        agregarFigura(circulo2, figuras);
        agregarFigura(rectangulo2, figuras);
  
        // Recorremos el ArrayList para ver las Areas de las figuras:
        for (Figura figura : figuras) {
            figura.calcularArea();
            System.out.println("---------------------");
        }
   
    }
    
    public static void agregarFigura(Figura figura, ArrayList listFiguras){
        listFiguras.add(figura);
    }

}
