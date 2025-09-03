
/*
TRABAJO PRACTICO N°2.
Alumno: ALVAREZ MESEGUES, Jose Matias
Comision: 18
*/

package Trabajo_Practico_2;

import java.util.Scanner;

public class Trabajo_Practico_2 {
    
    public static double entra_salida = 0.10;
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        // Insertamos el objeto tipo Scanner e importamos la clase
        Scanner input = new Scanner(System.in);
        
        System.out.println("Trabajo Practico 2");
        System.out.println("Punto 1.\n");
        
        // *** Estructuras Condicionales: ***
        /*
        --- 1). Verificación de Año Bisiesto ---
        Escribe un programa en Java que solicite al usuario un año y determine 
        si es bisiesto. 
        Un año es bisiesto si es divisible por 4, pero no por 
        100, salvo que sea divisible por 400.
        */
        
        int anio;
        
        System.out.print("Ingrese un anio: ");
        anio = Integer.parseInt(input.nextLine());
        
        // Convalidamos el dato con la siguiente funcion:
        anio = Utils.ValidarDatoPosiInt(anio);
        
        if ((anio % 4 == 0) || (anio % 400 == 0)) {
            if (anio % 100 == 0) {
                System.out.println("El anio no es bisiesto");
            } else {
                System.out.println("El anio es bisiesto");
            }
        } else {
            System.out.println("El anio no es bisiesto");
        }       
        System.out.println("\nPunto 2.\n");
        
        /*
        --- 2). Determinar el Mayor de Tres Números --- 
        Escribe un programa en Java que pida al usuario tres números enteros y 
        determine cuál es el mayor.
        */
        
        int num1, num2, num3, mayor;
        mayor = 0;
        
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese el tercer numero: ");
        num3 = Integer.parseInt(input.nextLine());
        
        mayor = num1;
        if (num2 > mayor){
            mayor = num2;
            if (num3 > mayor){
                mayor = num3;
                System.out.println("El numero mayor es el : " + mayor);
            } else {
                System.out.println("El numero mayor es el : " + mayor);
            }
        } else if (num3 > mayor){
            mayor = num3;
            System.out.println("El numero mayor es el : " + mayor);
        } else {
            System.out.println("El numero mayor es el : " + mayor);
        }
        
        System.out.println("\nPunto 3.\n");    
        
        /*
        --- 3). Clasificación de Edad. --- 
        Escribe un programa en Java que solicite al usuario su edad y 
        clasifique su etapa de vida según la siguiente tabla:
            ° Menor de 12 años:   "Niño"
            ° Entre 12 y 17 años: "Adolescente"
            ° Entre 18 y 59 años: "Adulto"
            ° 60 años o más:      "Adulto mayor"
        */
        
        int edad;
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());

        if (edad < 12) {
            System.out.println("\"Ninio\"");            
        } else if (12 <= edad && edad <= 17) {
            System.out.println("\"Adolescente\"");
        } else if (18 <= edad && edad <= 59) {
            System.out.println("\"Adulto\"");
        } else {
            System.out.println("\"Adulto mayor\"");
        }
        /*
        System.out.println("\nPunto 4.\n");    
        
        
        --- 4). Calculadora de Descuento según categoría.. --- 
        Escribe un programa que solicite al usuario el precio de un producto 
        y su categoría (A, B o C).:
        Luego, aplique los siguientes descuentos:
            ° Categoría A: 10% de descuento
            ° Categoría B: 15% de descuento
            ° Categoría C: 20% de descuento
        */
        
        double precio, precioConDesc;
        char categoria;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        precio = Utils.ValidarDatoPosiDoub(precio);
       
        System.out.println("""
                           Seleccione una categoria:
                           Categoria A: 10% de descuento
                           Categoria B: 15% de descuento
                           Categoria C: 20% de descuento""");
        categoria = input.nextLine().charAt(0);
        categoria = Character.toUpperCase(categoria);
        
        if (categoria == 'A') {
            precioConDesc = precio - ((precio * 10) / 100);
            System.out.println("El precio con un 10% de descuento es: " + precioConDesc);
        } else if (categoria == 'B') {
            precioConDesc = precio - ((precio * 15) / 100);
            System.out.println("El precio con un 15% de descuento es: " + precioConDesc);            
        } else if (categoria == 'C') {
            precioConDesc = precio - ((precio * 20) / 100);
            System.out.println("El precio con un 20% de descuento es: " + precioConDesc);
        } else {
            System.out.println("Opcion incorrecta");
        }
        
        System.out.println("\nPunto 5.\n");    
        
        // *** Estructuras de Repetición: ***
        /*
        --- 5). Suma de Números Pares (while). --- 
        Escribe un programa que solicite números al usuario y sume solo los 
        números pares. El ciclo debe continuar hasta que el usuario ingrese 
        el número 0, momento en el que se debe mostrar la suma total de los 
        pares ingresados.
        */
        
        int suma = 0, numero;
        
        System.out.println("""
                               Ingrese la cantidad de numeros que desee,
                               para finalizar ingrese el numero cero: """);
        numero = Integer.parseInt(input.nextLine());
        while (numero != 0){
            if (numero % 2 == 0) {
                suma += numero;
            }
            System.out.println("Ingrese otro numero");
            numero = Integer.parseInt(input.nextLine());
        }
        System.out.println("La suma de los numeros pares es: " + suma);
        
        System.out.println("\nPunto 6.\n"); 
        
        /*
        --- 6). Contador de Positivos, Negativos y Ceros (for). --- 
        Escribe un programa que pida al usuario ingresar 10 números enteros y 
        cuente cuántos son positivos, negativos y cuántos son ceros.
        */
        
        int positivos = 0, negativos = 0, ceros = 0;
        
        System.out.println("Ingrese 10 numeros enteros: ");
        
        for (int i = 0; i < 10; i++) {
            
            numero = Integer.parseInt(input.nextLine());
            
            if (numero > 0) {
                positivos += 1;
            } else if (numero < 0) {
                negativos += 1;
            } else {
                ceros += 1;
            }
        }
        
        System.out.println("Hay " + positivos + " numeros positivos");
        System.out.println("Hay " + negativos + " numeros negativos");
        System.out.println("Hay " + ceros + " ceros");
        
        System.out.println("\nPunto 7.\n"); 
        
        /*
        --- 7). Validación de Nota entre 0 y 10 (do-while). --- 
        Escribe un programa que solicite al usuario una nota entre 0 y 10. 
        Si el usuario ingresa un número fuera de este rango, debe seguir 
        pidiéndole la nota hasta que ingrese un valor válido.
        */
        
        int nota;
        
        System.out.println("Ingrese una nota entre 0 - 10: ");
        
        do {
            nota = Integer.parseInt(input.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }            
        } while (nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente");
        
        System.out.println("\nPunto 8.\n"); 
        
        /*
        --- 8). Cálculo del Precio Final con impuesto y descuento. --- 
        Crea un método calcularCostoEnvio(double impuesto, double descuento) 
        que calcule el precio final de un producto en un e-commerce. 
        La fórmula es:
        
        PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) 
        PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
        
        Desde main(), solicita el precio base del producto, el porcentaje de 
        impuesto y el porcentaje de descuento, llama al método y muestra 
        el precio final.
        */
        
        double impuesto, descuento, precioBase, precioFinal;
        
        System.out.print("Ingrese el precio de producto: ");
        precioBase = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el impuesto en porcentaje: ");
        impuesto = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el descuento en porcentaje: ");
        descuento = Double.parseDouble(input.nextLine());
        
        precioFinal = Utils.calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final del producto es: " + precioFinal);

        System.out.println("\nPunto 9.\n"); 
        
        /*
        --- 9). Composición de funciones para calcular costo de envío 
        y total de compra. --- 
            a). calcularCostoEnvio(double peso, String zona): Calcula el costo 
            de envío basado en la zona de envío (Nacional o Internacional) 
            y el peso del paquete.
                Nacional: $5 por kg
                Internacional: $10 por kg
        
            b). calcularTotalCompra(double precioProducto, double costoEnvio):
            Usa calcularCostoEnvio para sumar el costo del producto 
            con el costo de envío.
        
        Desde main(), solicita el peso del paquete, la zona de envío y 
        el precio del producto. Luego, muestra el total a pagar.
        */
        
        double peso, precioProducto, costoEnvio, total_a_pagar;
        char zona;
        
        System.out.print("Ingrese el pecio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el peso del producto en kg: ");
        peso = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese la zona de envio: ");
        System.out.println("N) - Nacional\nI) - Internacional\n");
        zona = input.nextLine().charAt(0);
        zona = Character.toUpperCase(zona);

        costoEnvio = Utils.calcularCostoEnvio(peso, zona);
        
        total_a_pagar = Utils.calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El costo total a pagar es: " + total_a_pagar);
        
        System.out.println("\nPunto 10.\n"); 
        
        /*
        --- 10). Actualización de stock a partir de venta y recepción 
        de productos. ---
        Crea un método actualizarStock(int stockActual, int cantidadVendida,
        int cantidadRecibida), que calcule el nuevo stock después de una 
        venta y recepción de productos:
            NuevoStock = StockActual − CantidadVendida + CantidadRecibida
            NuevoStock = CantidadVendida + CantidadRecibida
        Desde main(), solicita al usuario el stock actual, la cantidad 
        vendida y la cantidad recibida, y muestra el stock actualizado.
        */
        
        int stockActual, cantVendida, cantRecibida, stockActualizado;
        
        System.out.print("Ingrese el stock actual: ");
        stockActual = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad vendida: ");
        cantVendida = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad recibida: ");
        cantRecibida = Integer.parseInt(input.nextLine());
        
        stockActualizado = Utils.actualizarStock(stockActual, cantVendida, cantRecibida);
        
        System.out.println("Stock actual: " + stockActual);
        
        System.out.println("Cantidad vendida: " + cantVendida);
        
        System.out.println("Cantidad recibida: " + cantRecibida);
        
        System.out.println("Stock actualizado: " + stockActualizado);
        
        System.out.println("\nPunto 11.\n"); 
        
        /*
        --- 11). Cálculo de descuento especial usando variable global. ---
        Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, 
        crea un método calcularDescuentoEspecial(double precio) que use la 
        variable global para calcular el descuento especial del 10%.
        Dentro del método, declara una variable local descuentoAplicado, 
        almacena el valor del descuento y muestra el precio final 
        con descuento.
        */
        
        System.out.println("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        precioFinal = calcularDescuentoEspecial(precio);
        
        System.out.println("El precio final con el descuento es: " + precioFinal + " pesos");
        
        System.out.println("\nPunto 12.\n"); 
        
        /*
        --- 12). Modificación de un array de precios y visualización de 
        resultados. ---
        Crea un programa que:
            a. Declare e inicialice un array con los precios de algunos productos.
            b. Muestre los valores originales de los precios.
            c. Modifique el precio de un producto específico.
            d. Muestre los valores modificados.
        */
        
        // a).
        double [] precios_org = {199.99, 299.5, 149.75, 339.0, 89.99};
        
        // b).
        System.out.println("Precios Originales: ");
        for (int i = 0; i < precios_org.length; i++) {
            System.out.println("$" + precios_org[i]);
        }
        
        // c).
        precios_org[2] = 129.99;
        
        // d).
        System.out.println("\nPrecios modificados: ");
        for (int i = 0; i < precios_org.length; i++) {
            System.out.println("$" + precios_org[i]);
        }
        
        System.out.println("\nPunto 13.\n"); 
        
        /*
        --- 13). Impresión recursiva de arrays antes y después de modificar 
        un elemento. ---
        Crea un programa que:
            a. Declare e inicialice un array con los precios de algunos productos.
            b. Use una función recursiva para mostrar los precios originales.
            c. Modifique el precio de un producto específico.
            d. Use otra función recursiva para mostrar los valores modificados.
        */
       
        // a).
        double [] precios_org2 = {199.99, 299.5, 149.75, 339.0, 89.99};
        
        // b)
        System.out.println("Precios Originales: ");
        mostrarPrecios(precios_org2, 0);
        
        // c).
        precios_org2[2] = 129.99;
        
        // d).
        System.out.println("\nPrecios modificados: ");
        mostrarPrecios(precios_org2, 0);    
        
        System.out.println("\nFin Trabajo Practico.\n"); 
    }

    static double calcularDescuentoEspecial(double precio) {
        
        double precioFinal, descuentoAplicado;
        descuentoAplicado = entra_salida * 100;
        precioFinal = precio - (precio * descuentoAplicado)/100;
        
        return precioFinal;
    }
    
    public static void mostrarPrecios(double[] arr, int index) {
        if (index < arr.length) {
            System.out.println("$" + arr[index]);
            mostrarPrecios(arr, index + 1);
        }
    }
    
}
