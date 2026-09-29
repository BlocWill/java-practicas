// 10- Crear un programa que calcule el factorial de un numero dado

package com.magodev.mouredev.tema08;

public class Ejercicio10 {
    public static void main(String[] args) {

        int numero = 5;
        int factorial = 1; // aqui acumulamos las * para guardar * inicializamos en 1 y para las + iniciamos en 0

        for(int i = 1; i <= numero; i++) {
            factorial *= i;

        }
        System.out.println("El factorial de " + numero +" es: " + factorial);
    }
}
