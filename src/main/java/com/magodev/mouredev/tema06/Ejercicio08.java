// 8- Escribir un programa que determine si puedes entrar al cine, debes tener al menos 15 años o ir acompañado

package com.magodev.mouredev.tema06;

public class Ejercicio08 {
    public static void main(String[] args) {

        var age = 13;
        var estaAcompanado = false;

        if (age < 0) {
            System.out.println("Edad invalida");
        } else if (age >= 15 || estaAcompanado) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }

    }
}
