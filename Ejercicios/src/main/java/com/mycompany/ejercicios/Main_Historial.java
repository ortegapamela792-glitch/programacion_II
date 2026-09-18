
package com.mycompany.ejercicios;


public class Main_Historial {
    

    public static void main(String[] args) {

        HistorialNavegacion historial =
                new HistorialNavegacion();

        historial.visitarPagina("https://www.google.com");
        historial.visitarPagina("https://www.youtube.com");
        historial.visitarPagina("https://www.facebook.com");
        historial.visitarPagina("https://www.instagram.com");
        historial.visitarPagina("https://www.wikipedia.org");
        historial.visitarPagina("https://www.netflix.com");
        historial.visitarPagina("https://www.github.com");
        historial.visitarPagina("https://www.microsoft.com");
        historial.visitarPagina("https://www.oracle.com");
        historial.visitarPagina("https://www.java.com");
        historial.visitarPagina("https://www.netbeans.apache.org");

        historial.mostrarHistorial();
    }
}
