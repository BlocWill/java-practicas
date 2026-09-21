// 07- Eliminar uno de los elementos del HashSet

package com.magodev.mouredev.tema07;

import java.util.HashSet;

public class Ejercicio07 {
    public static void main(String[] args) {

        HashSet<Integer> id = new HashSet<>();

        id.add(7);
        id.add(45);
        id.add(43);
        id.add(80);
        id.add(32);
        System.out.println(id);
        System.out.println(id.size());

        id.remove(32);
        System.out.println(id);
        System.out.println(id.size());
    }
}
