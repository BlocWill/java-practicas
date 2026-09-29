// Usar un do-while para mostrar todos los valores de un ArrayList

package com.magodev.mouredev.tema08;

import java.util.ArrayList;

public class Ejercicio02 {
    public static void main(String[] args) {

        // Creamos el ArrayList y le agregamos elementos
        ArrayList<String> fruits = new ArrayList<>();

        // Agregamos los elementos al array
        fruits.add("Mandarina");
        fruits.add("Mango");
        fruits.add("Cambur");
        fruits.add("Lechosa");

        // Declaramos el ìndice (contador)
        int indice = 0;

        // Bucle do while
        do {
            // Imprimimos el elemento en la posicion ìndice
            System.out.println("El emento en posicion " + indice + ": " + fruits.get(indice));

            // Incrementamos el ìndice
            indice++;
        } while ( indice < fruits.size()); // Condicion (continùa mientras el indic sea menor que la cant de elemn del ArrayList
    }
}
