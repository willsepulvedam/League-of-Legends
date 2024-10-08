/*Elabore un algoritmo que realice lo siguiente:
• Ingrese el precio de 2 productos y la cantidad de unidades que solicita el cliente, calcular e imprimir el valor (total=precio * cantidad).
• Calcular e imprimir el subtotal (acumulado de los totales), a = a + total;
• Calcular e imprimir el IVA (19%), impuesto = a * IVA
• Calcular e imprimir el Total a pagar. totalPagar = a + impuesto;
 */

import java.util.Scanner;

public class Exercise4_WilmerSepulveda {
    public static void main(String[] args) {
        double precio1, precio2, cantidad1, cantidad2, total1, total2;

        double subtotal, impuesto, totalPagar;

        final double IVA = 0.19;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del primer producto: ");
        precio1 = scanner.nextDouble();
        System.out.print("Ingrese la cantidad de unidades del primer producto: ");
        cantidad1 = scanner.nextDouble();

        System.out.print("Ingrese el precio del segundo producto: ");
        precio2 = scanner.nextDouble();
        System.out.print("Ingrese la cantidad de unidades del segundo producto: ");
        cantidad2 = scanner.nextDouble();

        total1 = calcularTotal(precio1, cantidad1);
        total2 = calcularTotal(precio2, cantidad2);

        subtotal = calcularSubTotal(total1, total2);
    
        impuesto = calcularIVA(subtotal, IVA);

        totalPagar = calcularTotalPagar(subtotal, IVA);

        imprimirResultados(total1, total2, subtotal, impuesto, totalPagar); 
        
        scanner.close();
    }

    public static double calcularTotal(double producto, double cantidad){
        double total = producto * cantidad;
        return total;
    }

    public static double calcularSubTotal(double total1, double total2){
        double subtotal = total1 + total2;
        return subtotal;
    }

    public static double calcularIVA(double subtotal, double iva) {
        return subtotal * iva;
    }

    public static double calcularTotalPagar(double subtotal, double iva) {
        return subtotal + iva;
    }

    public static void imprimirResultados(double total1, double total2, double subtotal, double iva, double totalPagar) {
        System.out.printf("El total del producto 1 es: %.2f%n", total1);
        System.out.printf("El total del producto 2 es: %.2f%n", total2);
        System.out.printf("El subtotal es: %.2f%n", subtotal);
        System.out.printf("El IVA (19%%) es: %.2f%n", iva);
        System.out.printf("El total a pagar es: %.2f%n", totalPagar);
    }

}
