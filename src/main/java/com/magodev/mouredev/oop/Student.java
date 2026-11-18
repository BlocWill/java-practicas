// Crear una clase Student con atributo score y un metodo que diga si aprobo (mayor o igual a 60)

package com.magodev.mouredev.oop;

public class Student {

    // Atributo
    int score;

    // Constructor
    public Student(int score) {
        this.score = score;
    }

    // Metodo para verificar si aprobo
    public void verificarAprobacion() {
        if(score >= 60) {
            System.out.println("Felicidades aprobaste el curso");
        } else {
            System.out.println("Lo sentimos vuelve a intentarlo");
        }
    }
}
