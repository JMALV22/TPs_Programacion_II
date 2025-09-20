
package ejercicio_02;

public class Principal {

    public static void main(String[] args) {
        
        Bateria bateSamsung = new Bateria("bateSamsung", "4000 mAh");
        Celular samsung = new Celular("7584442", "Samsung", "A32", bateSamsung);
        Usuario matias = new Usuario("Matias", "987654321");
   
        samsung.getBateria();
        
        // Se realiza el cambio a una nueva bateria
        Bateria bateMotorola = new Bateria("bateMotorola", "6000 mAh");
        
        System.out.println("");
        samsung.cambioNuevaBateria(bateMotorola);
        samsung.getBateria();
        
        samsung.setUsuario(matias);
        System.out.println("");
        System.out.println("El celular " + samsung.getMarca() + " pertenece al " + samsung.getUsuario());
        System.out.println("");
        System.out.println("El usuario " + matias.getNombre() + " le pertenece el " + matias.getCelular());
        
    }

}
