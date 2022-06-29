package cl.springs.book.chapter04.ejercicios;

import java.util.Scanner;

/**         Sentencias condicionales.
            Ejercicio 04:
          Vamos a ampliar uno de los ejercicios de la relación anterior para
          considerar las extras. Escribe un programa que calcule el salario
          semanal de un trabajador teniendo en cuenta que las horas
          ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la
          hora. A partir de la hora 41, se pagan a 16 euros la hora.
 */

public class Ejercicio04 {
    public static void main(String[] args) {
        int sueldoSemanal;
        int horasTrabajadas;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de horas trabajadas semanlmente:   ");
        horasTrabajadas = entrada.nextInt();

        if (horasTrabajadas < 41) {
            sueldoSemanal = horasTrabajadas * 12;
        } else {
            sueldoSemanal = horasTrabajadas * 16;
        }

        System.out.println("El sueldo a pagar es $" + sueldoSemanal + " EUROS, con un total de horas trabajadas de: " + horasTrabajadas + " Horas semanales.");



    }
}
