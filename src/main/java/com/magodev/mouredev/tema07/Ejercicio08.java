// 8- Crear un HashMap donde la clave sea un nombre y el valor un numero de telefono añadir 3 contactos

package com.magodev.mouredev.tema07;

import java.util.HashMap;

public class Ejercicio08 {
    public static void main(String[] args) {

        HashMap<String, String> contacs = new HashMap<>();

        contacs.put("Maria","04165768654");
        contacs.put("Wilson","04249667598");
        contacs.put("Adriana","02777722773");

        System.out.println(contacs);
        System.out.println(contacs.size());

    }
}
