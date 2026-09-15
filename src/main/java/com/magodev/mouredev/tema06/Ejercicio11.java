// 11- continuaion del ejercicio 10, ahora que sucede si distintas variables tienen el mismo valor

package com.magodev.mouredev.tema06;

public class Ejercicio11 {
    public static void main(String[] args) {

        var a = 30;
        var b = 30;
        var c = 30;

        if (a == b && a > c) {
            System.out.println("a y b son iguales");
        } else if (a == c && a > b) {
            System.out.println("a y c son iguales");
        } else if (b == c && b > a) {
            System.out.println("b y c son iguales");
        } else if (a == b && a == c) {
            System.out.println("a, b y c son iguale");
        } else {
            System.out.println("No hay empate");
        }

    }
}
