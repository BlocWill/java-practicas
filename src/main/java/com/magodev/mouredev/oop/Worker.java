// Crear una clase worker que reciba nombre y salario y un metodo para mostrar su salario

package com.magodev.mouredev.oop;

public class Worker {

    // Atributos
    String name;
    double  salary;

    // constructor
    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // metodo
    public void showSalary() {
        System.out.println("El salario del trabajador: " + name + " es de: " + salary + " $");
    }
}
