package com.kbu.java.example.ch03;

public class IsDoneExample {
    public static void main(String[] args) {
        boolean isDone = true;
        System.out.println("initialized isDone: " + isDone);
        isDone = !isDone;
        System.out.println("!isDone: " + isDone);
        isDone = !isDone;
        System.out.println("!isDone: " + isDone);
    }
}
