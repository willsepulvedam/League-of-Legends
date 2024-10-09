/*. Elabora un algoritmo que solicite la edad de 2 hermanos y muestre un mensaje indicando
la edad del mayor y cuantos años de diferencia tiene con el menor. */

import java.util.Scanner;
public class Exercise5_WilmerSepulveda {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("ingresa la edad 1: ");
        int edad1 = s.nextInt();
        System.out.print("ingresa la edad 2: ");
        int edad2 = s.nextInt();

        int edadMayor = calcularEdad(edad1, edad2);
        int diferenciaEdad = calcularDiferenciaEdad(edad1, edad2);

        System.out.println("la edad del mayor es: " + edadMayor + " años y la diferancia es de " + diferenciaEdad);
    }
    
    public static int calcularDiferenciaEdad(int edad1, int edad2) {
        if (edad1 > edad2) {
            return edad1 - edad2;
        } else {
            return edad2 - edad1;
        }
    }

    public static int calcularEdad(int edad1, int edad2){ 
        if (edad1 > edad2) {
            int edadMayor = edad1;
            return edadMayor;
        } else {
            int edadMayor = edad2;
            return edadMayor;  
        }
    }
}
