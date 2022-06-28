package cl.springs.book.chapter04.preface;

import java.util.Scanner;

public class MenuConSwitch {
    public static void main(String[] args) {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        double lado;
        double base;
        double altura;

        System.out.println("CÁLCULO DE ÁREAS:   ");
        System.out.println("------------------------------------------");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Rectángulo");
        System.out.println("3.- Triángulo");
        System.out.println("\n Elija una opción (1 - 3):  ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("\nIntroduzca el lado del cuadrado en cm:    ");
                lado = entrada.nextDouble();
                System.out.println("\nEl área del cuadrado es: " + (lado * lado) + " cms2.");
                break;

            case 2:
                System.out.println("\nIntroduzca la base del rectángulo en cm:    ");
                base = entrada.nextDouble();
                System.out.println("\nIntroduzca la altura del rectángulo en cm:    ");
                altura = entrada.nextDouble();
                System.out.println("\nEl área del rectángulo es: " + (altura * base) + " cms2.");
                break;

            case 3:
                System.out.println("\nIntroduzca la base del triángulo en cm:    ");
                base = entrada.nextDouble();
                System.out.println("\nIntroduzca la altura del triángulo en cm:    ");
                altura = entrada.nextDouble();
                System.out.println("\nEl área del triángulo es: " + ((altura * base) / 2) + " cms2.");
                break;

            default:
                System.out.println("\nLo siento, la opción elegida no es correcta.");
        }
    }
}