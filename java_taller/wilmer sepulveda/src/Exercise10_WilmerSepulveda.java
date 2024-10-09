
import java.util.Scanner;

/*Realice un algoritmo que determine el pago a realizar por la entrada a un espectáculo donde
se pueden comprar sólo hasta cuatro entradas, donde al costo de dos entradas se les
descuenta el 10%, al de tres entradas el 15% y a la compra de cuatro tickets se le descuenta
el 20 %. */

public class Exercise10_WilmerSepulveda {
    public static void main(String[] args) {
        int opcion;

        Scanner s = new Scanner(System.in);

        do {
            menu();
            opcion = s.nextInt();
            if (opcion >= 1 && opcion <= 4) {
                descuentos(opcion);
                break;
            } else if (opcion == 5) {
                System.out.println("Gracias por visitar.");
            } else {
                System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 5);

    }
    public static void menu() {
        System.out.println("------------------------------------");
        System.out.println("BIENVENIDOS");
        System.out.println("Cada entrada tiene el valor de $10.");
        System.out.println("1. Comprar 1 entradas");
        System.out.println("2. Comprar 2 entradas");
        System.out.println("3. Comprar 3 entradas");
        System.out.println("4. Comprar 4 entradas");
        System.out.println("5. Salir");
        System.out.println("-------------------------------------");
        System.out.print("ingrese su opcion: ");
    }

    public static void descuentos(int opcion) {
        double valor;
        double descuento;
        switch (opcion) {
            case 1:
                valor = 10;
                System.out.println("El costo de la entrada es: $ " + valor);
                System.out.println("haz comprado 1 boleta, disfruta del espectaculo.");
                break;
            case 2:
                valor = 10 * 2;
                descuento = valor - (valor * 0.10);
                System.out.println("Se realizo un descuento del 10%, El costo de la entrada es: $ " + descuento);
                System.out.println("haz comprado 2 boleta, disfruta del espectaculo.");
                break;
            case 3:
                valor = 10 * 3;
                descuento = valor - (valor * 0.15);
                System.out.println("Se realizo un descuento del 15%, El costo de la entrada es: $ " + descuento);                
                System.out.println("haz comprado 3 boleta, disfruta del espectaculo.");
                break;
            case 4:
                valor = 10 * 4;
                descuento = valor - (valor * 0.20);
                System.out.println("Se realizo un descuento del 20%, El costo de la entrada es: $ " + descuento);                
                System.out.println("haz comprado 4 boleta, disfruta del espectaculo.");
                break;
            case 5:
                System.out.println("gracias por visitar");
                break;
            default:
                break;
        }
    }
}
