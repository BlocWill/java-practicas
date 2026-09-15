// 2- Declarar dos numeros y mostrar cual es el mayor o si son iguales

package com.magodev.mouredev.tema06;

public class Ejercicio02 {
    public static void main(String[] args) {

        var number1 = 65;
        var number2 = 65;

        if (number1 == number2) {
            System.out.println("number1 y number2 son iguales");
        } else if (number1 < number2) {
            System.out.println("number2 es mayor");
        } else {
            System.out.println("number1 es mayor");
        }
    }
}
