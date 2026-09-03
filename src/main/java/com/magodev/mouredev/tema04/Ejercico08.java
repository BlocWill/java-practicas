// 8 Añadir alguna negacion

package com.magodev.mouredev.tema04;

public class Ejercico08 {
    public static void main(String[] args) {

        var r = 50;
        var s = 70;
        var t = 100;
        System.out.println(s > t || t >= r && !(s < t && r < t));
    }
}
