package com.magodev.mouredev.tema07;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        // Declaracion y ceacion
        ArrayList<String> name = new ArrayList<>(); // notacion antigua aun valida
        var numbers = new ArrayList<Integer>();     // notacion nueva

        // Tamaño
        System.out.println(name.size());

        // Añadir elementos
        name.add("Nazareth");
        name.add("Gonzalez");
        name.add("Naza");
        System.out.println(name.size());

        // Acceder a los elementos
        System.out.println(name.getFirst()); // para acceder al primer elemento
        System.out.println(name.get(1));     // para acceder al elemento en especifico, el primero o el ultimo
        System.out.println(name.getLast());  // para acceder al ultimo elemento

        // Modificar los elementos
        name.set(2, "nazita@gmail.com"); // primero el indice a cambiar y luego el nuevo valor

        // Eliminar elementos
        name.remove(2); // indicamos el i a eliminar
        //System.out.println(name.get(2)); / da error estoy accediendo a un i que no exixte
        System.out.println(name.size()); // aqui voy a ver 2 elementos ya que borre un elemento

        // Buscar elementos
        System.out.println(name.contains("Nazareth"));
        System.out.println(name.contains("nazita@gmail.com"));

        // Limpiar ArrayList
        name.clear();
        System.out.println(name.size());

        // En los Arrays podemos crear un array con datos primitivos
        // En las listas tenemos que trabajar con objetos por su forma dimanica
    }
}
