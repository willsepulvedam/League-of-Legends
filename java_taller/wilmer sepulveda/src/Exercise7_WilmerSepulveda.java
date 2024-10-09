/*Elabore un algoritmo utilizando JAVA para un CASA DE CAMBIO DE MONEDA EXTRANJERA,
que realice lo siguiente:
• Mostrar un menú con las siguientes opciones:
1. Dólares a pesos.
2. Euro a pesos.
3. Yenes a pesos.
4.Pesos a Dólares.
5.Pesos a Euro.
6.Pesos a Yenes.
7.Salir de la aplicación.
• De acuerdo con la opción seleccionada mostrar el resultado del valor que recibirá
el cliente. */

import java.util.Scanner;
public class Exercise7_WilmerSepulveda {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double valor, conversion;
        int opcion;

        while (true) { 
            menu();
            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor en dólares");
                    valor = s.nextDouble();
                    conversion = dolarPesos(valor);
                    System.out.println("El valor en pesos es: $ " + conversion);
                    break;
                case 2:
                    System.out.println("Ingrese el valor en euros");
                    valor = s.nextDouble();
                    conversion = euroPesos(valor);
                    System.out.println("El valor en pesos es: $ " + conversion);
                    break;
                case 3:
                    System.out.println("Ingrese el valor en yenes");
                    valor = s.nextDouble();
                    conversion = yenesPesos(valor);
                    System.out.println("El valor en pesos es: $ " + conversion);
                    break;
                case 4:
                    System.out.println("Ingrese el valor en pesos");
                    valor = s.nextDouble();
                    conversion = pesoDolar(valor);
                    System.out.println("El valor en dolares es: $ " + conversion);
                    break;
                case 5:
                    System.out.println("Ingrese el valor en pesos");
                    valor = s.nextDouble();
                    conversion = pesoEuro(valor);
                    System.out.println("El valor en euros es: € " + conversion);
                    break;
                case 6:
                    System.out.println("Ingrese el valor en pesos");
                    valor = s.nextDouble();
                    conversion = pesoYenes(valor);
                    System.out.println("El valor en yenes es: ¥ " + conversion);
                    break;
                case 7:
                    System.out.println("Saliendo de la aplicación...");
                    return;
                default:
                    break;
                
            }
        }
    }
    public static double dolarPesos(double valor){
        return valor * 4234;
    }
    public static double euroPesos(double valor){
        return valor * 4633;
    }
    public static double yenesPesos(double valor){
        return valor * 28;
    }
    public static double pesoDolar(double valor){
        return valor / 4234;
    }
    public static double pesoEuro(double valor){
        return valor / 4633;
    }
    public static double pesoYenes(double valor){
        return valor / 28;
    }

    public static void menu(){
        System.out.println("CASA DE CAMBIO");
        System.out.println("1. Dólares a pesos");
        System.out.println("2. Euro a pesos");
        System.out.println("3. Yenes a pesos");
        System.out.println("4. Pesos a Dólares");
        System.out.println("5. Pesos a Euro");
        System.out.println("6. Pesos a Yenes");
        System.out.println("7. Salir de la aplicación");
        System.out.print("Ingrese su opcion: ");
    }
}
