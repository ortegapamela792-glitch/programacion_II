
package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = teclado.nextInt();

            numeros.add(numero);
        }

        System.out.println("\nElementos de la lista:");

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
