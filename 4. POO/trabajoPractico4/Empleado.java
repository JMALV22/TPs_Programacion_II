
package trabajoPractico4;

public class Empleado {
    private int id;                              // Identificador único del empleado.
    private String nombre;                       // Nombre completo.
    private String puesto;                       // Cargo que desempeña.
    private double salario;                      // Salario actual.
    private static int totalEmpleados;           // Contador global de empleados creados.
    final static int CANTIDADFIJAAUMENTO = 200;  // Cantidad fija a aumentar

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {        
        this.nombre = nombre;
        this.puesto = puesto;
        salario = 2000;
        totalEmpleados++;
        id = Empleado.totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null){
            this.nombre = nombre;
        }
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (puesto != null){
            this.puesto = puesto;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void actualizaSalario(int porcentaje){
        salario = salario + ((salario * porcentaje) / 100);
    }
    
    public void actualizaSalario(){
        salario = salario + CANTIDADFIJAAUMENTO;
    }
    
    public void mostraDatosEmpleado(){
        System.out.println("Orden: " + id + "\nNombre: " + nombre
                + "\nPuesto: " + puesto + "\nSalrio: " + salario + "\n");
    }
    
    public void mostrarTotalEmpleados(){
        System.out.println("Total de empleados al momento: " + totalEmpleados);
    }

    @Override
    public String toString() {
        return "Empleado {" + "id=" + id + ", nombre=" + nombre + ", puesto=" 
                + puesto + ", salario=" + salario;
    }
  
}
