
package ejercicio_2;
import java.lang.Math;

public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public void calcularArea(){
       double area = 0;
       area = Math.PI*(radio*radio);
        System.out.println(mostrarArea() + area);
    }
}
