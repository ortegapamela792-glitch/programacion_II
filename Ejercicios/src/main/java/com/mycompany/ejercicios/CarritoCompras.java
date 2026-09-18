
package com.mycompany.ejercicios;

import java.util.ArrayList;

public class CarritoCompras {
    
    private ArrayList<ItemCarrito> items;

    public CarritoCompras() {

        items = new ArrayList<>();
    }

    public void agregarItem(String producto,
                             int cantidad,
                             double precioUnitario) {

        for (ItemCarrito item : items) {

            if (item.producto.equalsIgnoreCase(producto)) {

                item.cantidad += cantidad;
                return;
            }
        }

        ItemCarrito nuevoItem =
                new ItemCarrito(producto, cantidad, precioUnitario);

        items.add(nuevoItem);
    }

    public void eliminarItem(String producto) {

        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).producto.equalsIgnoreCase(producto)) {

                items.remove(i);
                return;
            }
        }
    }

    public void vaciarCarrito() {

        items.clear();
    }

    public double calcularTotal() {

        double total = 0;

        for (ItemCarrito item : items) {

            total += item.calcularSubtotal();
        }

        return total;
    }

    public void mostrarCarrito() {

        System.out.println("CARRITO DE COMPRAS");
        System.out.println("=========================");

        for (ItemCarrito item : items) {
            item.mostrarItem();
        }

        System.out.println("TOTAL: Q" + calcularTotal());
    }
}
