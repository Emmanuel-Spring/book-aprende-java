package cl.springs.book.chapter04.preface;

import java.util.Scanner;

public class SentenciaIf02 {
    public static void main(String[] args) {

        int respuesta;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, introduce un número entero");
        respuesta = entrada.nextInt();

        if ( respuesta < 0) {
            System.out.println("El número introducido es negativo");
        } else {
            System.out.println("El número ingresado es positivo");
        }
    }
}
