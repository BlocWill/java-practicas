// 9- implementar una funcion que reciba una cadena y retorne su longitud

package com.magodev.mouredev.tema09;

public class Ejercicio09 {
    public static void main(String[] args) {

        int resultado = tamanio("Nazita");
        System.out.println(resultado);

    }

    public static int tamanio(String palabra) {

        return palabra.length();
    }
}
