
package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio08 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("¿Cuántos números desea ingresar? ");
        int cantidad = teclado.nextInt();

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Ingrese el número "
                    + (i + 1) + ": ");

            int numero = teclado.nextInt();

            numeros.add(numero);
        }

        System.out.println("\nNúmeros pares:");

        for (int numero : numeros) {

            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
