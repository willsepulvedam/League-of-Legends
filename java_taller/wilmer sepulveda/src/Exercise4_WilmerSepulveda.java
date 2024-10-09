import java.util.Scanner;

public class Exercise4_WilmerSepulveda {
    public static void main(String[] args) {
        double precio1, precio2, cantidad1, cantidad2;
        double total1, total2, subtotal, impuesto, totalPagar;
        final double IVA = 0.19;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el precio del primer producto: ");
            precio1 = scanner.nextDouble();
            System.out.print("Ingrese la cantidad de unidades del primer producto: ");
            cantidad1 = scanner.nextDouble();

            System.out.print("Ingrese el precio del segundo producto: ");
            precio2 = scanner.nextDouble();
            System.out.print("Ingrese la cantidad de unidades del segundo producto: ");
            cantidad2 = scanner.nextDouble();

            if (precio1 > 0 && precio2 > 0 && cantidad1 > 0 && cantidad2 > 0) {
                break; 
            } else {
                System.out.println("Error: Los valores ingresados deben ser positivos. Inténtelo de nuevo.");
            }
        }

        total1 = calcularTotal(precio1, cantidad1);
        total2 = calcularTotal(precio2, cantidad2);
        subtotal = calcularSubTotal(total1, total2);
        impuesto = calcularIVA(subtotal, IVA);
        totalPagar = calcularTotalPagar(subtotal, impuesto);

        imprimirResultados(total1, total2, subtotal, impuesto, totalPagar); 
        scanner.close();
    }

    public static double calcularTotal(double producto, double cantidad){
        return producto * cantidad;
    }

    public static double calcularSubTotal(double total1, double total2){
        return total1 + total2;
    }

    public static double calcularIVA(double subtotal, double iva) {
        return subtotal * iva;
    }

    public static double calcularTotalPagar(double subtotal, double impuesto) {
        return subtotal + impuesto;
    }

    public static void imprimirResultados(double total1, double total2, double subtotal, double iva, double totalPagar) {
        System.out.printf("El total del producto 1 es: %.2f%n", total1);
        System.out.printf("El total del producto 2 es: %.2f%n", total2);
        System.out.printf("El subtotal es: %.2f%n", subtotal);
        System.out.printf("El IVA (19%%) es: %.2f%n", iva);
        System.out.printf("El total a pagar es: %.2f%n", totalPagar);
    }
}
