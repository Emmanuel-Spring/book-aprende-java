package cl.springs.book.chapter04.ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        int  primera = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
        Integer n = entrada.nextInt();
        //n = entrada.nextLine().length();

        if ( n < 10 ) {
            primera = n;
        }

        if (( n >= 10 ) && ( n < 100 )) {
            primera = n / 10;
        }

        if (( n >= 100 ) && ( n < 1000 )) {
            primera = n / 100;
        }

        if (( n >= 1000 ) && (n < 10000 )) {
            primera = n / 1000;
        }

        if ( n >= 1000 ) {
            primera = n / 10000;
        }

        System.out.println("La cifra del número introducido es el : " + primera);

    }
}
