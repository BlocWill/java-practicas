// 6- Añadir un nuevo valor repetido y otro sin repetir al HashSet

package com.magodev.mouredev.tema07;

import java.util.HashSet;

public class Ejercicio06 {
    public static void main(String[] args) {

        HashSet<String> fruit = new HashSet<>();

        fruit.add("Apple");
        fruit.add("Pineapple");
        fruit.add("Strawberry");
        fruit.add("Apple");

        System.out.println(fruit);
    }
}
