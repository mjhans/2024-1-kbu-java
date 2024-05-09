package com.kbu.java.example.ch07.SimpleAccount;

public class AccountDemon {
    public static void main(String[] args) {
        Account account01 = new Account("01", "sam", 12);
        System.out.println(account01.getInfo());
        account01.withdraw(2);
        System.out.println(account01.getInfo());

        Account account02 = new Account("02", "james");
        System.out.println(account02.getInfo());
        account02.deposit(2000);
        System.out.println(account02.getInfo());

        Account account03 = new Account("03", "jane", 30);
        System.out.println(account03.getInfo());
    }
}
