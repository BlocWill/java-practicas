// Crear una clase rectangle con metodos para calcular el area y el perimetro

package com.magodev.mouredev.oop;

public class Rectangle {

    // Atributos
    double width;
    double height;

    // constructor
    public Rectangle(double width, double heigth) {
        this.width = width;
        this.height = heigth;
    }

    // Metodo para calcular area
    public double calculateArea() {
        return width * height;
    }

    // Metodo para calcular perimetro
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

}
