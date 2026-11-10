package com.magodev.mouredev.oop;

public class Persona {

    // Atributos

    String nombre;
    int edad;

    // Constructor: este recibe el nombre de la Clase, podemos decidir que parametros recibe el constructor

    public Persona(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodos

    public void diHola() {
        System.out.println("Hola mi nombre es: " + nombre + " " + "y tengo: " + edad + " " + "años");
    }
}
