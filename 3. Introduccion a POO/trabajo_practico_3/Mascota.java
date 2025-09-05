
package trabajo_practico_3;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad + " anios");
    }
    
    public void setMascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;        
        this.edad = edad;
    }
    
    public void cumplirAnios(int anios){
        edad += anios; 
    }
}
