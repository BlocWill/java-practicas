// 5- Escribir una funcion que reciba un numero y diga si es par o impar

package com.magodev.mouredev.tema09;

public class Ejercicio05 {
    public static void main(String[] args) {

        var par = number(15);
        System.out.println(par);
    }

    public static boolean number(int calculoPar) {
        if (calculoPar % 2 == 0) {
            return true;
        }
        return false;

    }


}


