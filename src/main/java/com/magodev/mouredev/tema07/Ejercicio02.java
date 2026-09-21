// 2- Modificar uno de los valores del Array e imprimir el valor del indice antes y despues de modificarlo

package com.magodev.mouredev.tema07;

public class Ejercicio02 {
    public static void main(String[] args) {

        String[] cars = {"Siena", "Aveo", "Fiesta", "Neon", "Gol"};

        System.out.println(cars[3]);
        cars[3] = "Hylux";
        System.out.println(cars[3]);
    }
}
