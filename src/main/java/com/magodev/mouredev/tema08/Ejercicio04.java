// 4- Reccorrer un Array de 5 numeros e imprimir su suma total

package com.magodev.mouredev.tema08;

import java.sql.SQLOutput;

public class Ejercicio04 {
    public static void main(String[] args) {

        int[] numeros = {9, 7, 5, 3, 1};
        int suma = 0;

        for(int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma total es: " + suma);


        // Ejemplo de inventario
        String[] postres = {"Quesillo", "Tres leches", "Marquesa chocolate", "Brownie", "Galletas chip"};
        int[] cantidades = {10, 5, 3, 2, 7};

        int totalInventario = 0;

        for(int i = 0; i < postres.length; i++) {
            System.out.println(postres[i] + ": " + cantidades[i] + " unidades.");
            totalInventario += cantidades[i];
        }
        System.out.println("Total de productos en el inventario: " + totalInventario);
    }
}
