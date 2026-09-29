// 5- Usar un for para recorrer un Array y mostrar sus valores

package com.magodev.mouredev.tema08;

public class Ejercicio05 {
    public static void main(String[] args) {

        String[] materias = {"Matematicas", "Algebra", "Programacion", "Fisica"};

        for(int indice = 0; indice < materias.length; indice++) {
            System.out.println(materias[indice]);
        }
    }
}
