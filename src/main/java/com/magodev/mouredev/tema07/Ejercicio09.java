// 9- Del HashMap modificar un contacto y eliminar otro

package com.magodev.mouredev.tema07;

import java.util.HashMap;

public class Ejercicio09 {
    public static void main(String[] args) {

        HashMap<String, String> contacs = new HashMap<>();

        contacs.put("Maria","04165768654");
        contacs.put("Wilson","04249667598");
        contacs.put("Adriana","02777722773");
        System.out.println(contacs);
        System.out.println(contacs.size());

        contacs.replace("Wilson", "02775542376");
        System.out.println(contacs);
        System.out.println(contacs.size());

        contacs.remove("Adriana");
        System.out.println(contacs);
        System.out.println(contacs.size());
    }
}
