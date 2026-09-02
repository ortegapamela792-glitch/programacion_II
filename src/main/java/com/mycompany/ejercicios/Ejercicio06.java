
package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;
 
public class Ejercicio06 {
    

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> pendientes = new ArrayList<>();

        pendientes.add("Hacer tarea de Java");
        pendientes.add("Estudiar para el examen");
        pendientes.add("Realizar ejercicios");
        pendientes.add("Entregar proyecto");

        int opcion;

        do {

            System.out.println("\n===== ACTIVIDADES PENDIENTES =====");
            System.out.println("1. Mostrar actividades");
            System.out.println("2. Marcar como completada");
            System.out.println("3. Eliminar actividad");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("\nActividades:");

                    if (pendientes.isEmpty()) {
                        System.out.println("No hay actividades pendientes.");
                    } else {

                        for (int i = 0; i < pendientes.size(); i++) {
                            System.out.println(i + " - " + pendientes.get(i));
                        }
                    }

                    break;

                case 2:

                    if (pendientes.isEmpty()) {
                        System.out.println("No hay actividades.");
                    } else {

                        for (int i = 0; i < pendientes.size(); i++) {
                            System.out.println(i + " - " + pendientes.get(i));
                        }

                        System.out.print("Ingrese el índice de la actividad completada: ");
                        int indice = teclado.nextInt();

                        if (indice >= 0 && indice < pendientes.size()) {

                            System.out.println(
                                    "Actividad completada: "
                                    + pendientes.get(indice)
                            );

                            pendientes.set(
                                    indice,
                                    pendientes.get(indice) + " - COMPLETADA"
                            );

                        } else {

                            System.out.println("Índice inválido.");
                        }
                    }

                    break;

                case 3:

                    if (pendientes.isEmpty()) {
                        System.out.println("No hay actividades.");
                    } else {

                        for (int i = 0; i < pendientes.size(); i++) {
                            System.out.println(i + " - " + pendientes.get(i));
                        }

                        System.out.print("Ingrese el índice que desea eliminar: ");
                        int indice = teclado.nextInt();

                        if (indice >= 0 && indice < pendientes.size()) {

                            pendientes.remove(indice);

                            System.out.println("Actividad eliminada.");

                        } else {

                            System.out.println("Índice inválido.");
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
