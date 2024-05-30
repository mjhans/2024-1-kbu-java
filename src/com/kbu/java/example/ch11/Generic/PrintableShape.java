package com.kbu.java.example.ch11.Generic;

public abstract class PrintableShape implements Printable{

    @Override
    public void Print() {
        System.out.printf("printing... [%s] \n", this.getClass().getName());
    }

}
