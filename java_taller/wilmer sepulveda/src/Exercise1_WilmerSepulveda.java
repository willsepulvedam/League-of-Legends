/*
Elabore un algoritmo que calcule el monto a pagar por el servicio de estacionamiento,
teniendo en cuenta que por la primera hora de estadía se tiene una tarifa de $3.000 pesos
y las restantes tienen un costo de $2000 pesos. Ten en cuenta que si el total a pagar es
mayor igual a $20000 pesos, se debe aplicar un descuento del 10%.
Imprimir:
- Total:
- Descuento:
- Total a pagar:
 */
import java.util.Scanner;

public class Exercise1_WilmerSepulveda {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of parking hours:");
        int horas = s.nextInt();

        int total = calcularTotal(horas);
        double descuento = calcularDescuento(total);

        mostrarResultados(total, descuento);

        s.close();
    }
    
    public static int calcularTotal(int horas) {
        int tarifaPrimeraHora = 3000;
        int tarifaRestantesHoras = 2000;
        
        if (horas == 1) {
            return tarifaPrimeraHora;
        } else {
            return tarifaPrimeraHora + (horas - 1) * tarifaRestantesHoras;
        }
    }

    public static double calcularDescuento(int total) {
        if (total >= 20000) {
            return total * 0.10;
        } else {
            return 0;
        }
    }

    public static void mostrarResultados(int total, double descuento) {
        double totalAPagar = total - descuento;
        System.out.println("Total: $" + total);
        System.out.println("Discount: $" + descuento);
        System.out.println("Total to pay: $" + totalAPagar);
    }
}