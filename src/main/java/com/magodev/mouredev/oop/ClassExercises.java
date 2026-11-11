package com.magodev.mouredev.oop;

public class ClassExercises {
    public static void main(String[] args) {
        var book = new Book("El padrino", "Mario Puzzo");

        book.titulo = "El padrino";
        book.autor = "Mario Puzzo";

        System.out.println("Titulo: " + book.titulo);
        System.out.println("Autor: " + book.autor);

        var dog = new Dog();

        dog.bark();
    }
}
