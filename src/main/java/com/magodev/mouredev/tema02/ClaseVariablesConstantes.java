package com.magodev.mouredev.tema02;

public class ClaseVariablesConstantes {
    public static void main(String[] args) {

        // Variables:

        String name = "Wilson";
        System.out.println(name);

        name = "Wilo";        // estamos cambiando el valor de la variable
        System.out.println(name);

       // name = 45; Error (NO podemos cambiar el tipo de datos)

        int age = 45;
        System.out.println(age);

        /* Podemos usar la palabra reservada "var" para definir una variable, y el tipo de la variable
        se infiere segun el dato le añadamos en primera instasncia ( se le conoce como inferencia de tipos)
         */

        var email = "wilsonmg@gmail.com";
        System.out.println(email);

        var year = 2026;
        System.out.println(year);


        // Constantes

        final String EMAIL = "wilsonmg@gmail.com";
        System.out.println(EMAIL);


    }
}
