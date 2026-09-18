
package com.mycompany.ejercicios;

import java.util.ArrayList;

public class Ventas_Diarias {
    
public class Main {

    public static double calcularPromedio(ArrayList<Double> ventas) {

        double suma = 0;

        for (double venta : ventas) {
            suma += venta;
        }

        return suma / ventas.size();
    }

    public static double calcularMaximo(ArrayList<Double> ventas) {

        double maximo = ventas.get(0);

        for (double venta : ventas) {

            if (venta > maximo) {
                maximo = venta;
            }
        }

        return maximo;
    }

    public static double calcularMinimo(ArrayList<Double> ventas) {

        double minimo = ventas.get(0);

        for (double venta : ventas) {

            if (venta < minimo) {
                minimo = venta;
            }
        }

        return minimo;
    }

    public static int diasSobrePromedio(ArrayList<Double> ventas) {

        double promedio = calcularPromedio(ventas);

        int cantidad = 0;

        for (double venta : ventas) {

            if (venta > promedio) {
                cantidad++;
            }
        }

        return cantidad;
    }

    public static void main(String[] args) {

        ArrayList<Double> ventas = new ArrayList<>();

        ventas.add(500.0);
        ventas.add(750.0);
        ventas.add(600.0);
        ventas.add(900.0);
        ventas.add(450.0);
        ventas.add(800.0);
        ventas.add(1000.0);
        ventas.add(650.0);
        ventas.add(700.0);
        ventas.add(850.0);

        double promedio = calcularPromedio(ventas);
        double maximo = calcularMaximo(ventas);
        double minimo = calcularMinimo(ventas);
        int dias = diasSobrePromedio(ventas);

        System.out.println("VENTAS DEL MES");
        System.out.println("-------------------------");

        System.out.println("Promedio mensual: Q" + promedio);
        System.out.println("Venta máxima: Q" + maximo);
        System.out.println("Venta mínima: Q" + minimo);
        System.out.println("Días sobre el promedio: " + dias);
    }
}
