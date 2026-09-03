// 5 Utilizar el operador logico (AND)

package com.magodev.mouredev.tema04;

public class Ejercicio05 {
    public static void main(String[] args) {

        var id1 = 5;
        var id2 = 8;

        System.out.println(id1 < id2 && id1 != id2);
        System.out.println(id2 > id1 && id1 == id2);
        System.out.println(id1 == id2 && id1 < id2);
        System.out.println(id2 <= id1 && id1 <=id2);

    }
}
