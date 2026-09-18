
package com.mycompany.ejercicios;

import java.util.ArrayList;

public class HistorialNavegacion {
    
    private ArrayList<String> historial;

    public HistorialNavegacion() {
        historial = new ArrayList<>();
    }

    public void visitarPagina(String url) {

        historial.add(url);

        if (historial.size() > 10) {
            historial.remove(0);
        }
    }

    public void mostrarHistorial() {

        System.out.println("HISTORIAL DE NAVEGACION");
        System.out.println("-------------------------");

        for (String url : historial) {
            System.out.println(url);
        }
    }
}