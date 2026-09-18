
package com.mycompany.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Principal8 {
    
    public static void main(String[] args) {

        ArrayList<Factura> facturas = new ArrayList<>();

        facturas.add(new Factura(1, "Carlos", 500.00));
        facturas.add(new Factura(2, "Ana", 300.00));
        facturas.add(new Factura(3, "Carlos", 250.00));
        facturas.add(new Factura(4, "Pedro", 400.00));
        facturas.add(new Factura(5, "Ana", 150.00));

        HashMap<String, Double> resumen = new HashMap<>();

        for (Factura factura : facturas) {

            String cliente = factura.getCliente();
            double monto = factura.getMonto();

            if (resumen.containsKey(cliente)) {

                resumen.put(cliente,
                        resumen.get(cliente) + monto);

            } else {

                resumen.put(cliente, monto);
            }
        }

        System.out.println("RESUMEN DE FACTURACIÓN");
        System.out.println("======================");

        for (Map.Entry<String, Double> entrada : resumen.entrySet()) {

            System.out.println(
                    "Cliente: " + entrada.getKey()
                    + " | Total facturado: Q"
                    + entrada.getValue()
            );
        }
    }
}
