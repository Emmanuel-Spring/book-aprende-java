package cl.springs.book.chapter04.ejercicios;

import java.util.Scanner;

/**   Sentencia condicional.
      Ejercicio 01:
      Ejercicio 1 Escribe un programa que pida por teclado un día de la semana
      y que diga qué asignatura toca a primera hora ese día.
 */
public class Ejercicio01 {
    public static void main(String[] args) {

        String dia;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un día de la semana, y sabrá que asignatura le toca a primera hora :   ");
        dia = entrada.next();
        dia.toLowerCase();

        switch (dia) {
            case "lunes":
                System.out.println("Ingeniería de sistemas");
                break;
            case "martes":
                    System.out.println("Algoritmos avanzados");
                    break;
            case "miercoles":
                System.out.println("Patrones de diseño");
                break;
            case "jueves":
                System.out.println("Arquitectura limpia y Arquitectura Backend For Fronend (BFF)");
                break;
            case "viernes":
                System.out.println("Springboot y Spring Cloud");
                break;
            case "sabado":
                System.out.println("Jenkins, Docker y Kubernetes: CI/CD");
                break;
            case "domingo":
                System.out.println("Oracle Cloud Infrastructure y OKE");
                break;
            default:
                System.out.println("Día ingresado fuera de rango");
        }
    }
}
