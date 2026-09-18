
package com.mycompany.ejercicios;


public class ItemCarrito {
    

    String producto;
    int cantidad;
    double precioUnitario;

    public ItemCarrito(String producto, int cantidad,
                       double precioUnitario) {

        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double calcularSubtotal() {

        return cantidad * precioUnitario;
    }

    public void mostrarItem() {

        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: Q" + precioUnitario);
        System.out.println("Subtotal: Q" + calcularSubtotal());
        System.out.println("-------------------------");
    }
}
