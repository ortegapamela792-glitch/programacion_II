

package com.mycompany.ejercicios;

import java.util.ArrayList;


public class Main {
    

    public static ArrayList<Empleado> buscarEmpleados(
            ArrayList<Empleado> empleados,
            String departamento) {

        ArrayList<Empleado> resultado = new ArrayList<>();

        for (Empleado empleado : empleados) {

            if (empleado.departamento.equalsIgnoreCase(departamento)
                    && empleado.salario > 5000) {

                resultado.add(empleado);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado("Ana", "Ventas", 6500));
        empleados.add(new Empleado("Carlos", "Sistemas", 7500));
        empleados.add(new Empleado("María", "Ventas", 4500));
        empleados.add(new Empleado("Pedro", "Sistemas", 6000));
        empleados.add(new Empleado("Luis", "Contabilidad", 7000));

        ArrayList<Empleado> resultado =
                buscarEmpleados(empleados, "Sistemas");

        System.out.println("EMPLEADOS DE SISTEMAS QUE GANAN MÁS DE Q5,000:");

        for (Empleado empleado : resultado) {
            empleado.mostrarEmpleado();
        }
    }
}
