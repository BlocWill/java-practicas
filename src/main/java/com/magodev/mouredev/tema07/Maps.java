package com.magodev.mouredev.tema07;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        // Declaracion y creacion
        HashMap<String, String> names = new HashMap<>(); // Notacion 1
        var number = new HashMap<Integer, String>();     // Notacion 2

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.put("Wilson", "wilson@gmail.com");
        names.put("Gonzalez", "gonzalez@gmail.com");
        names.put("Magodev", "magodev@gmail.com");

        System.out.println(names.size()); // Tamaño del  mapa
        System.out.println(names);        // Que contiene el mapa

        // Acceder a los elementos / En los Set NO tenemos como acceder a los elementos/ en los Map si podemos
        System.out.println(names.get("Gonzalez"));
        // Accediendo a una clave que NO existe
        System.out.println(names.get("Dev")); // mi printea un null, no existe esta clave/ pero no da error

        // Verificar elementos o comprobar si existe
        System.out.println(names.containsKey("Gonzalez")); // Verificando si existe una clave
        System.out.println(names.containsKey("Dev"));      // Verificando si existe una clave

        System.out.println(names.containsValue("gonzalez@gmail.com")); // verificando si existe el valor

        // Eliminar elementos
        System.out.println(names.remove("Gonzalez")); // me retorna el valor de la clave que se elimino
        System.out.println(names.remove("Magodev"));
        System.out.println(names);

        // Limpiar HashMap
        names.clear();
        System.out.println(names);

        // Modificacion de elementos
        names.put("Wilson", "wilson@gmail.com");
        System.out.println(names);

        names.put("Wilson", "wilsongonzalez@gmail.com");
        System.out.println(names);

        names.replace("Gonzalez", "magodev@gmail.com"); // Reemplaza el valor si existe
        System.out.println(names);

        names.putIfAbsent("Gonzalez", "magodev@gmail.com"); // Solo lo añade si NO existe
        System.out.println(names);

        // Otras operaciones
        System.out.println(names.isEmpty());

        var values = names.values();
        System.out.println(values);

    }
}
