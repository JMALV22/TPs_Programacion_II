
package ejercicio_07;

public class Principal {

    public static void main(String[] args) {
        
        Motor nissan = new Motor("Nissan V8", "V8-1543522-Z");
        Conductor pepecorredor = new Conductor("Jose", "A857112-J5");
        Vehiculo yaris = new Vehiculo("AD154R", "yaris-sport", nissan);
        
        yaris.datosVehiculo();
        System.out.println("");
        yaris.setConductor(pepecorredor);
        yaris.datosVehiculo();
        
        System.out.println("");
        
        pepecorredor.datosConductor();
        
        System.out.println("");
        yaris.setConductor(null);
        yaris.datosVehiculo();
        
    }

}
