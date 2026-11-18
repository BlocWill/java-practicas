// Crear una clase Rectangle con metodos para calcular el área y el perímetro

package com.magodev.mouredev.oop;

public class Rectangle {

    // Atributos
    double width;
    double height;

    // constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Método para calcular área
    public double calculateArea() {
        return width * height;
    }

    // Método para calcular perimetro
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

}
