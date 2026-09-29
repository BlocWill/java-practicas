// 9- Usar un break para detener un bucle cuando encuentre un numero negativo en un Array

package com.magodev.mouredev.tema08;

public class Ejercicio09 {
    public static void main(String[] args) {

        int[] digitos = {12, 23, 45, 58, -11, 28, 7};

        for(int idx = 0; idx < digitos.length; idx++) {
            if(digitos[idx] < 0) {
                break;
            }
            System.out.println(digitos[idx]);
        }
    }
}
