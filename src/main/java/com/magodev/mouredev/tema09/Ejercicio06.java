// 6- Crear un metodo que reciba una edad y retorne true si es mayor de edad y false en caso contrario

package com.magodev.mouredev.tema09;

public class Ejercicio06 {
    public static void main(String[] args) {

        var entrada = edad(18);
        System.out.println(entrada);
    }
    public static boolean edad(int miEdad) {
        if(miEdad <= 17) {
            return false;
        }
        return true;
    }
}
