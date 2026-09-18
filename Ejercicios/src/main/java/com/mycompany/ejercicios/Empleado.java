
package com.mycompany.ejercicios;


public class Empleado {
    

    String nombre;
    String departamento;
    double salario;

    public Empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void mostrarEmpleado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: Q" + salario);
        System.out.println("-------------------------");
    }
}
