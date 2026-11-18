// Crear una clase BankAccount con atributo balance y un metodo deposito que sume el saldo

package com.magodev.mouredev.oop;

public class BankAccount {

    // Atributo
    double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Metodo
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Haz depositado: " + amount + ". Tu saldo actual es de: " + balance);

    }

}
