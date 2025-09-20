
package ejercicio_08;

public class Principal {

    public static void main(String[] args) {
        
        Usuario matias = new Usuario("Matias", "xxxxx@gmail.com");
        Documento contrato = new Documento("Contrato de compra/venta", "--Contenido--", "hx001548ae522e", "02/10/2003", matias);
        
        contrato.mostrarDoc();
        System.out.println("");
        
        System.out.println("Datos firma digital:\n" + contrato.getFirmaDigital().mostrarDatosFirmaDig());
        
        
        
    }

}
