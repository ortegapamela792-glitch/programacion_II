
package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04 {
   
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> elementos = new ArrayList<>();

        int opcion;

        do {

            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento por índice");
            System.out.println("3. Mostrar elementos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese el elemento: ");
                    String elemento = teclado.nextLine();

                    elementos.add(elemento);

                    System.out.println("Elemento agregado.");

                    break;

                case 2:

                    if (elementos.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {

                        System.out.println("Elementos actuales:");

                        for (int i = 0; i < elementos.size(); i++) {
                            System.out.println(i + " - " + elementos.get(i));
                        }

                        System.out.print("Ingrese el índice que desea eliminar: ");
                        int indice = teclado.nextInt();

                        if (indice >= 0 && indice < elementos.size()) {

                            elementos.remove(indice);

                            System.out.println("Elemento eliminado.");

                        } else {

                            System.out.println("Índice inválido.");
                        }
                    }

                    break;

                case 3:

                    System.out.println("\nElementos de la lista:");

                    if (elementos.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {

                        for (int i = 0; i < elementos.size(); i++) {
                            System.out.println(i + " - " + elementos.get(i));
                        }
                    }

                    break;

                case 4:

                    System.out.println("Programa finalizado.");

                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);
    }
}
