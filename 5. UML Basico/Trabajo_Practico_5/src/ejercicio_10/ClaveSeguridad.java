
package ejercicio_10;

public class ClaveSeguridad {
    
    private String codigo;
    private String ultmaModificacion;

    public ClaveSeguridad(String codigo, String ultmaModificacion) {
        this.codigo = codigo;
        this.ultmaModificacion = ultmaModificacion;
    }
    
    public String mostrarClave(){
        return codigo + ", Ultima modificacion: " + ultmaModificacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUltmaModificacion() {
        return ultmaModificacion;
    }

    public void setUltmaModificacion(String ultmaModificacion) {
        this.ultmaModificacion = ultmaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultmaModificacion=" + ultmaModificacion + '}';
    }

}