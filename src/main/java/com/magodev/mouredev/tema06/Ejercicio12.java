package com.magodev.mouredev.tema06;

public class Ejercicio12 {

    public static void main(String[] args) {

        var a = 30;
        var b = 30;
        var c = 10;

        if (a == b && b == c) {
            System.out.println("a, b y c son iguales");

        } else if (a == b && a > c) {
            System.out.println("a y b son iguales y son los mayores");

        } else if (a == c && a > b) {
            System.out.println("a y c son iguales y son los mayores");

        } else if (b == c && b > a) {
            System.out.println("b y c son iguales y son los mayores");

        } else if (a > b && a > c) {
            System.out.println("a es mayor");

        } else if (b > a && b > c) {
            System.out.println("b es mayor");

        } else {
            System.out.println("c es mayor");
        }
    }
}
