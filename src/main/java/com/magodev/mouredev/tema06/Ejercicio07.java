// 7- Simular un sistemas de notas, "Sobresaliente", "aprobado", "Suspenso" segun la nota de (0 a 100)

package com.magodev.mouredev.tema06;

public class Ejercicio07 {
    public static void main(String[] args) {

        var nota = 0;

        if (nota < 0 || nota > 100) {
            System.out.println("Nota invalida");
        } else if (nota >= 65) {
            System.out.println("Sobresaliente");
        } else if (nota >= 30) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

    }
}
