// 4- Añadir 4 valores al ArrayList y eliminar uno a continuacion

package com.magodev.mouredev.tema07;

import java.util.ArrayList;

public class Ejercicio04 {
    public static void main(String[] args) {

        var cakes = new ArrayList<String>();

        cakes.add("Tiramisu");
        cakes.add("Selva negra");
        cakes.add("Tres leche");
        cakes.add("Red velvet");

        cakes.remove(2);

        System.out.println(cakes);
    }
}
