package com.magodev.mouredev.tema06;

public class ClaseCondicionales {
    public static void main(String[] args) {

        var age = 11;

        if(age > 18) {
            System.out.println("el usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("Este pajero tiene 18 recien cumplidos");
        } else {
            System.out.println("pajero menor");
        }


        var day = 2;

        switch (day) {
            case 1:
                System.out.println("Lunes zapatero");
                break;
            case 2:
                System.out.println("Martes de medio dia");
                break;
            case 3:
                System.out.println("Miercoles de cerveza");
                break;
            case 4:
                System.out.println("Jueves de parque");
                break;
            case 5:
                System.out.println("Viernes vamos a ver");
                break;
            case 6:
                System.out.println("Sabado vamos a tomar");
                break;
            case 7:
                System.out.println("Domingo no jodas");
                break;
            default:
                System.out.println("Vt a la gran mier");


        }

    }
}
