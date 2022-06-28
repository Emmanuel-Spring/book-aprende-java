package cl.springs.book.chapter04.preface;

import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {

        int mes;
        String nombreDelMes;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, introduzca un número de mes:      ");
        mes = entrada.nextInt();

        switch (mes) {
            case 1:
                nombreDelMes = "Enero";
                break;
            case 2:
                nombreDelMes = "Febrero";
                break;
            case 3:
                nombreDelMes = "Marzo";
                break;
            case 4:
                nombreDelMes = "Abril";
                break;
            case 5:
                nombreDelMes = "Mayo";
                break;
            case 6:
                nombreDelMes = "Junio";
                break;
            case 7:
                nombreDelMes = "Julio";
                break;
            case 8:
                nombreDelMes = "Agosto";
                break;
            case 9:
                nombreDelMes = "Septiembre";
                break;
            case 10:
                nombreDelMes = "Octubre";
                break;
            case 11:
                nombreDelMes = "Noviembre";
                break;
            case 12:
                nombreDelMes = "Diciembre";
                break;
            default:
                nombreDelMes = "No existe este mes";
        }

        System.out.println("Mes  0" + mes + ": " + nombreDelMes);
    }
}
