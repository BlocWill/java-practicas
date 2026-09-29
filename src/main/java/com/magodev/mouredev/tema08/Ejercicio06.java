// 6- Usar un for-each para recorrer un HashSet y un HashMap

package com.magodev.mouredev.tema08;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ejercicio06 {
    public static void main(String[] args) {

        HashSet<String> autos = new HashSet<>();

        autos.add("Audi");
        autos.add("Mercedes benz");
        autos.add("Mclaren");
        autos.add("Ferrari");

        for(String auto : autos) {
            System.out.println(auto);
        }

        HashMap<String, String> identification = new HashMap<>();

        identification.put("Bartolomeo", "1");
        identification.put("Gallina grande", "37");
        identification.put("Gallina pequeña", "11");
        identification.put("sapo", "29");

        for(Map.Entry<String, String> id : identification.entrySet()) {
            System.out.println(id);
        }


    }
}
