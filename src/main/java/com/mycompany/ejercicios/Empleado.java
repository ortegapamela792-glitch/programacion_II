
package com.mycompany.ejercicios;


public class Empleado {
    
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void mostrarDatos() {
        System.out.println(
                "Nombre: " + nombre
                + " | Salario: Q" + salario
        );
    }
}

