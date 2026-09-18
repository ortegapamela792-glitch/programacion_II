
package com.mycompany.ejercicios;


public class MainCarritoCompras {
   

    public static void main(String[] args) {

        CarritoCompras carrito = new CarritoCompras();

        carrito.agregarItem("Teclado", 1, 150);
        carrito.agregarItem("Mouse", 2, 75);
        carrito.agregarItem("Monitor", 1, 1200);

        // Se agrega nuevamente el teclado.
        // No crea otro elemento, aumenta la cantidad.
        carrito.agregarItem("Teclado", 2, 150);

        carrito.mostrarCarrito();

        System.out.println();
        System.out.println("Eliminando Mouse...");

        carrito.eliminarItem("Mouse");

        carrito.mostrarCarrito();
    }
}
