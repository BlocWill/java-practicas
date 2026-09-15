// 1- Establecer la edad de un usuario y mostrar si puede votar (mayor o igual a 18 años)

package com.magodev.mouredev.tema06;

public class Ejercicio01 {
    public static void main(String[] args) {

        var ageUser = 17;

        if(ageUser >= 18) {
            System.out.println("Eres mayor de edad, puedes votar");

        } else {
            System.out.println("Eres menor de edad, no puedes votar");
        }
    }
}