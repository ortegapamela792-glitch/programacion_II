
package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio07 {
   
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Double> calificaciones = new ArrayList<>();

        System.out.print("¿Cuántas calificaciones desea ingresar? ");
        int cantidad = teclado.nextInt();

        double suma = 0;

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Ingrese la calificación "
                    + (i + 1) + ": ");

            double calificacion = teclado.nextDouble();

            calificaciones.add(calificacion);

            suma = suma + calificacion;
        }

        double promedio = suma / calificaciones.size();

        System.out.println("\nCalificaciones:");

        for (double nota : calificaciones) {
            System.out.println(nota);
        }

        System.out.println("\nPromedio: " + promedio);
    }
}