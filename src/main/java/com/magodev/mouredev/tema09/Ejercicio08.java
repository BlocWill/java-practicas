// 8- Crear un metodo que reciba un array de enteros calcula su media y lo retorna

package com.magodev.mouredev.tema09;

public class Ejercicio08 {
    public static void main(String[] arg) {
        int[] cifra = {80, 80, 110, 120};

        double resultado = promedio(cifra);

        System.out.println("El promedio de este array: " + resultado);
    }

    public static double promedio(int[] digitos) {

        int suma = 0;

        for (int i = 0; i < digitos.length; i++) {
            suma += digitos[i];
        }

        return (double) suma / digitos.length;
    }
}


