
package com.mycompany.ejercicios;


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio05 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Carlos");
        nombres.add("Cristian");
        nombres.add("Merlin");
        nombres.add("Jimena");
        nombres.add("Paola");

        System.out.print("Ingrese el nombre que desea buscar: ");
        String nombre = teclado.nextLine();

        if (nombres.contains(nombre)) {

            System.out.println("El nombre SI existe en la lista.");

        } else {

            System.out.println("El nombre NO existe en la lista.");
        }

        System.out.println("\nLista de nombres:");

        for (String n : nombres) {
            System.out.println(n);
        }
    }
}
