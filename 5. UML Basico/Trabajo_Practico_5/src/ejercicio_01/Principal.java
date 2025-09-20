
package ejercicio_01;

public class Principal {

    public static void main(String[] args) {
        
        Titular juan = new Titular("Juan", "12345678");
        Pasaporte V05 = new Pasaporte("V05", "02/05/2025", "https//imagen.png", "png");
        
        System.out.println(juan);
        System.out.println(V05);
        
        juan.setPasaporte(V05);
        
        System.out.println("");
        System.out.println("El pasaporte asignado a: " + juan.getNombre()
        + " es " + juan.getPasaporte());
        
        System.out.println("El titular asignado al pasaporte: " + V05.getNumero()
        + " es " + V05.getTitular());
        
    }

}
