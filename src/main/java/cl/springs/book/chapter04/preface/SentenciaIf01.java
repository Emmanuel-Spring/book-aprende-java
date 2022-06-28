package cl.springs.book.chapter04.preface;

import java.util.Scanner;

public class SentenciaIf01 {
    public static void main(String[] args) {

        String respuesta;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cual es la Capital de Chile ??");
        respuesta = entrada.next();

        if (respuesta.equals("Santiago")) {
            System.out.println("La respuesta es correcta !!!!");
        } else {
            System.out.println("La respuesta es incorrecta");
        }
    }
}
