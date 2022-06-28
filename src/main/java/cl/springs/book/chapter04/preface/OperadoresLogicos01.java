package cl.springs.book.chapter04.preface;

import java.util.Scanner;

public class OperadoresLogicos01 {
    public static void main(String[] args) {

        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Adivina el número pensado:   ");
        System.out.println("Introduce el número entre el 1 y el 100");
        numero = entrada.nextInt();

        if ((numero < 1) || (numero > 100)) {
            System.out.println("El número introducido debe estar en el rango de 1 a 100.");
            System.out.println("Tienes otra oportunidad, introduce el número:  ");
            numero = entrada.nextInt();
        }

        if (numero == 24) {
            System.out.println("Has acertado !!!!");
        } else {
            System.out.println("Has perdido !!!");
        }
    }
}
