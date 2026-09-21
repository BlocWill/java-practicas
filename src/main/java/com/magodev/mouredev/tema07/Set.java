package com.magodev.mouredev.tema07;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

        // Declaracion y creacion
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        // El set es una estructura desordenada
        names.add("Wilson");
        names.add("Gonzalez");
        names.add("magodev");
        names.add("wilson@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Eliminar elementos
        names.remove("Wilson");
        System.out.println(names.size());

        // Buscar elementos
        System.out.println(names.contains("Wilson"));
        System.out.println(names.contains("gonzalez@gmail.com"));

        // Caracteristica del set NO acepta repetidos o duplicados
        System.out.println(names);
        names.add("Wilson");
        names.add("Wilson");
        names.add("Wilson");
        System.out.println(names); // solo me va imprimir un solo elemento "Wilson"

        // Conjuntos: podemos añadir a un conjunto elementos de otro conjunto
        // A un set de cadenas de texto no se le pueden añadir un set de numeros
        //names.addAll(numbers); / error de incompatibilidad uno es un Strin y el otro son numeros

        var countries = new HashSet<String>();
        countries.add("Venezuela");
        countries.add("España");
        countries.add("Argentina");
        countries.add("magodev"); // Prueba de que es un valor repetido y no se va mostrar

        names.addAll(countries); // Añadiendo elementos de countrie en el set de names

        System.out.println(names);
        System.out.println(names.size());

        names.removeAll(countries); // Eliminando los elementos del set contries en el set names
        System.out.println(names);
        System.out.println(names.size());

        // Dejar los elementos comunes
        names.retainAll(countries); // Me muestra elementos comunes
        System.out.println(names);  // No me va mostrar nada por el removeAll de countries


    }
}
