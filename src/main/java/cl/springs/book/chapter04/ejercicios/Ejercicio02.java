package cl.springs.book.chapter04.ejercicios;

import java.util.Scanner;

/**     Sentencia condicional.
         Ejercicio 2
         Realiza un programa que pida una hora por teclado y que muestre luego buenos
         días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
         6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
         horas, los minutos no se deben introducir por teclado.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        int hora;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la Hora actual:   ");
        hora = entrada.nextInt();

        if (hora >= 6 && hora < 13) {
            System.out.println("Buenos días !!!");
        }
        if (hora >= 13 && hora < 21) {
            System.out.println("Buenas tardes !!!");
        }
        if ((hora >= 21 && hora <=24) || (hora >= 0 && hora < 6)) {
            System.out.println("Buenas noches !!");
        }
        if (hora > 24 || hora < 0) {
            System.out.println("Hora ingresada incorrecta.");
        }
    }
}
