
package com.mycompany.ejercicios;


public class Producto {
    

    int id;
    String nombre;
    double precio;
    int stock;

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarProducto() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: Q" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("-------------------------");
    }
