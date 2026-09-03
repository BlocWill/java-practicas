// 6 Usar el operador logico (OR)

package com.magodev.mouredev.tema04;

public class Ejercicio06 {
    public static void main(String[] argrs) {

        var x = 14;
        var y = 16;

        System.out.println(x < y || y > x);
        System.out.println(y != x || x == y);
        System.out.println(x >= y || x <= y);
        System.out.println(y != y || y <= x);
    }
}
