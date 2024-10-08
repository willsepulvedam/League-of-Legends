/*Hacer un programa que, de acuerdo con el año de nacimiento de una persona, indique en
qué etapa de su vida están, (niñez 1-12, adolescencia 13-17, juventud 18-30, adultes 31-60,
vejez 61-100). Solo edades entre 1 y 100 años. */
import java.util.Scanner;

public class Exercise3_WilmerSepulveda {
    public static void main(String[] args) {
        
        final int AÑO = 2024;

        
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese su año de nacimiento: ");
        int año_nacimiento = s.nextInt();

        int edad = AÑO - año_nacimiento;
        System.out.println("tu edad es "+ edad);

        if (edad >= 1 && edad <= 12) {
            System.out.println("Estás en la etapa de la niñez");
        } else if (edad >= 13 && edad <= 17){
            System.out.println("Estás en la etapa de la adolescencia");
        } else if (edad >= 18 && edad <= 30){
            System.out.println("Estás en la etapa de la juventud");
        } else if (edad >= 31 && edad <= 60){
            System.out.println("Estás en la etapa de la adultez");
        } else if (edad >= 61 && edad <= 100){
            System.out.println("Estás en la etapa de la vejez");
        } else {
            System.out.println("Edad fuera de rango");
        }

        s.close();

    }
}
