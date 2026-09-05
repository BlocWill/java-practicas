// 6 Formatear un String con un entero

package com.magodev.mouredev.tema05;

public class Ejercicio06 {
    public static void main(String[] args) {

        var valor = 45;
        var cake = "Tres leche";

        System.out.println(String.format("el postre: %s. tiene un valor de: %d", cake, valor));
    }
}
