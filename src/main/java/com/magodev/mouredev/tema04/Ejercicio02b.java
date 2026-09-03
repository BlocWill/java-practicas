// 2.b Crear una variable para cada tipo de operacion de asignacion ( original)


package com.magodev.mouredev.tema04;

public class Ejercicio02b {
    public static void main(String[] args) {

        var asignar = 5;
        asignar = 20;
        System.out.println(asignar);

        var suma = 15;
        suma += 15;
        System.out.println(suma);

        var resta = 99;
        resta -= 44;
        System.out.println(resta);

        var multiplicacion = 8;
        multiplicacion *= 5;
        System.out.println(multiplicacion);

        var division = 60;
        division /= 4;
        System.out.println(division);

        var modulo = 100;
        modulo %= 3;
        System.out.println(modulo);

        suma = modulo;
        System.out.println(suma);

    }
}
