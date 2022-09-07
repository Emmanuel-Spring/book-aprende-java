package cl.springs.book.chapter04.ejercicios;

import java.util.Scanner;

/**      Sentencias Condicionales.
         Ejercicio 3
         Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
         nombre del día de la semana.
 */

public class Ejercicio03 {
    public static void main(String[] args) {
        int numeroDia;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa un número de 1 al 7 (Se imprimirá el día):  ");
        numeroDia = entrada.nextInt();

        switch (numeroDia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero fuera de rango");

        }
    }
}
