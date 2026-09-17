
package com.mycompany.ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
    
      public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String elemento;

        System.out.println("Ingrese elementos.");
        System.out.println("Escriba 'fin' para terminar.");

        do {
            System.out.print("Ingrese un elemento: ");
            elemento = teclado.nextLine();

            if (!elemento.equalsIgnoreCase("fin")) {
                System.out.println("Elemento ingresado: " + elemento);
            }

        } while (!elemento.equalsIgnoreCase("fin"));

        System.out.println("Programa finalizado.");
    }
}