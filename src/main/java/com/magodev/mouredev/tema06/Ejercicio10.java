// 10- Usar tres variables a, b, c y muestra cual es mayor de las tres

package com.magodev.mouredev.tema06;

public class Ejercicio10 {
    public static void main(String[] args) {

        var a = 25;
        var b = 13;
        var c = 58;

        if (a > b && a > c) {
            System.out.println("a es mayor");
        } else if (b > a && b > c) {
            System.out.println("bes mayor");
        } else {
            System.out.println("c es mayor");
        }
    }
}
