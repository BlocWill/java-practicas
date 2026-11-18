package com.magodev.mouredev.oop;

public class ClassExercises {
    public static void main(String[] args) {

        // Clase Book con atributos title y autor. Crear un objeto y muestra sus datos
        var book = new Book("El padrino", "Mario Puzzo");

        book.titulo = "El padrino";
        book.autor = "Mario Puzzo";

        System.out.println("Titulo: " + book.titulo);
        System.out.println("Autor: " + book.autor);

        // Clase Dog con metodo ladrar (bark)
        var dog = new Dog();

        dog.bark();

        // Class Car crea autos y muestra sus datos con el method showData()

        var auto1 = new Car("Audi", "A8");
        auto1.showData();

        // Clase student con atributo score y metodo que muestra si aprobo

        var student1 = new Student(59);
        student1.verificarAprobacion();

        var student2 = new Student(65);
        student2.verificarAprobacion();

        // Clase BankAccount atributo balance, metodo deposito que suma el saldo

        var cuenta1 = new BankAccount(457);
        cuenta1.deposit(589);

        // Clase rectangle con metodos para calcular el area y el perimetro
        var rectangulo = new Rectangle(6.0, 4.0);

        // Imprimimos
        System.out.println("Area del rectangulo: " + rectangulo.calculateArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.calculatePerimeter());



    }
}
