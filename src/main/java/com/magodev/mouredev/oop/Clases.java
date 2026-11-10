package com.magodev.mouredev.oop;

public class Clases {
    public static void main(String[] args) {

        var persona = new Persona("Wilson", 45);

        persona.nombre = "Wilson";
        persona.edad = 45;

        persona.diHola();

        persona.nombre = "Magodev";

        System.out.println(persona.nombre);

        // Creacion de otra persona
        var persona2 = new Persona("Nazareth", 7);
        persona2.diHola();
    }
}



