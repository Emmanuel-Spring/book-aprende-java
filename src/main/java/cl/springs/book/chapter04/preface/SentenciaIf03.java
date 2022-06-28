package cl.springs.book.chapter04.preface;

import java.util.Scanner;

public class SentenciaIf03 {
    public static void main(String[] args) {

        double respuesta;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qué nota has sacado en el último exámen ??");
        respuesta = entrada.nextDouble();

        if ( respuesta >= 5) {
            System.out.println("Has aprobado !!");
        } else {
            System.out.println("Has reprobado.");
        }
    }
}
