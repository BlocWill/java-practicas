// 3 Mostrar el primer y ultimo caracter de un String

package com.magodev.mouredev.tema05;

public class Ejercicio03 {
    public static void main(String[] args) {

        String cake = "Tiramisu";
        System.out.println(cake.substring(0, 1));
        System.out.println(cake.charAt(cake.length() - 1));

        System.out.println(cake.charAt(0) + " " + cake.charAt(cake.length() -1));

    }
}
