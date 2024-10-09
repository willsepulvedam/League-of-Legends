/*Elabora un algoritmo para leer 3 números enteros diferentes entre sí, y determinar el
número mayor de los tres. */
import java.util.Scanner;
public class Exercise6_WilmerSepulveda {
    public static void main(String[] args) {
        int num1, num2, num3, mayor;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = scanner.nextInt();

        mayor = numeroMayor(num1, num2, num3);

        System.out.println("El número mayor es: " + mayor);
    }

    public static int numeroMayor(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else if (num3 > num1 && num3 > num2){
            return num3;
        } else {
            return 0;
        }
    }   
}
