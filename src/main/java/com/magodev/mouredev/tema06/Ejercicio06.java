// 6- Declarar una variable con el dia de la semana (1 - 7) y muestra su nombre

package com.magodev.mouredev.tema06;

public class Ejercicio06 {
    public static void main(String[] args) {

        var dayWeek = 4;

        switch (dayWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
            default:
                System.out.println("Error");
        }
    }
}

