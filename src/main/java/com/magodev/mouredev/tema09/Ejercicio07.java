// 7- Implementar un funcion que reciba una cadena y retorne su longitud

package com.magodev.mouredev.tema09;

public class Ejercicio07 {
    public static void main(String[] args) {

        var cadena = longitud("Magodev");
        System.out.println(cadena);

    }

    public static int longitud(String palabra) {
        return palabra.length();
    }
}
