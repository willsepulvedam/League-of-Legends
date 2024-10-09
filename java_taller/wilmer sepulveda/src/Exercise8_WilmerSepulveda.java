/*Elaborar un programa que determine el pago de un trabajador de acuerdo a las horas
trabajadas: si las horas trabajadas en el mes son mayores a 20, el pago por horas será de
$12.000 y si son menores el pago por hora será de $10.000. */

import java.util.Scanner;
public class Exercise8_WilmerSepulveda {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el número de horas trabajadas: ");
        double horas = s.nextInt();

        double pago = pagoTrabajador(horas);
        System.out.println("El pago del trabajador es: $" + pago);
        s.close();
    }

    public static double pagoTrabajador(double horasTrabajadas){
        if (horasTrabajadas > 20) {
        return horasTrabajadas * 12000;
        } else {
        return horasTrabajadas * 10000;
        }
    }
}
