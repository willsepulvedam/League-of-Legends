/*A un trabajador le descuentan de su sueldo el 10%, si su sueldo es menor o igual a 1000, por
encima de 1000 y hasta 2000 el 5% del adicional, y por encima de 2000 el 3% del adicional.
Calcular el descuento y sueldo neto que recibe el trabajador dado su sueldo.
 */
import java.util.Scanner;
public class Exercise9_WilmerSepulveda {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su sueldo: ");
        double sueldo = s.nextDouble();

        double pagoTotal = calcularSueldo(sueldo);
        System.out.println("Su sueldo neto es: " + pagoTotal);
    }

    public static double calcularSueldo(double sueldo) {
        if (sueldo < 1000) {
            return sueldo - (sueldo * 0.10);
        } else if (sueldo >= 1000 && sueldo < 2000) {
            return sueldo - (sueldo * 0.05);
        } else {
            return sueldo - (sueldo * 0.30);
        }
    }
}