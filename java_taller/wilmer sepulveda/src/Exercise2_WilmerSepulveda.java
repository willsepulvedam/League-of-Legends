/*
Construir una calculadora minera, la cual permita saber a cuántos pesos equivalen los kilos
de oro ingresados. El usuario deberá ingresar tanto los kilos a convertir como el precio en
pesos por onza de oro. Recordemos que una onza equivale a 28.3495 gramos y que 1000
gramos son un kilo.
 */
import java.util.Scanner;

public class Exercise2_WilmerSepulveda {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese el peso del oro a convertir (por favor ingrese el peso en kilos): ");
        double kilos = s.nextDouble();

        System.out.print("Ingrese el precio en pesos por onza de oro: ");
        double precioPorOnza = s.nextDouble();

        double precioTotal = convertirOro(kilos, precioPorOnza);
        System.out.printf("El valor total en pesos por %.2f kilos de oro es: %.2f pesos%n", kilos, precioTotal);

        s.close();
    }

    public static double convertirOro(double kilos, double precioPorOnza) {
        double gramos = kilos * 1000;
        double onzas = gramos / 28.3495;
        return onzas * precioPorOnza;
    }
}

