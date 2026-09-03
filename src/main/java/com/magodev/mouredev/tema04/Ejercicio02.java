// 2- Crear una variable para cada tipo de operacion de asignacion

package com.magodev.mouredev.tema04;

public class Ejercicio02 {
    public static void main(String[] args) {

        var valorDeLaSuma = 7;
        valorDeLaSuma += 3;

        var valorDeLaResta = 11;
        valorDeLaResta -= 5;

        var valorDelaMultiplicacion = 58;
        valorDelaMultiplicacion *= 3;

        var valorDeLaDivision =  358;
        valorDeLaDivision /= 3;

        var valorDelModulo = 99;
        valorDelModulo %= 1;

        valorDelaMultiplicacion /= valorDeLaResta *=valorDeLaSuma;

        System.out.println(valorDeLaSuma);
        System.out.println(valorDeLaResta);
        System.out.println(valorDelaMultiplicacion);
        System.out.println(valorDeLaDivision);
        System.out.println(valorDelModulo);
        System.out.println(valorDelaMultiplicacion);

    }
}

