// 9- Crear un programa que diga si una letra es vocal o consonante (char)

package com.magodev.mouredev.tema06;

public class Ejercicio09 {
    public static void main(String[] args) {

        char letter = 'e';

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("Es vocal");
        } else {
            System.out.println("Es consonante");
        }

    }
}
