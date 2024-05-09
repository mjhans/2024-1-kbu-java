package com.kbu.java.example.ch08.UseInterface.impl;

import com.kbu.java.example.ch08.UseInterface.*;

public class Dog implements InterfaceAnimal {
    public void sound() {
        System.out.println(CATEGORY + " woof");
    }
}
