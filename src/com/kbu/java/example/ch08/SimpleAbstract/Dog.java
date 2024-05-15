package com.kbu.java.example.ch08.SimpleAbstract;

public class Dog extends Animal{
    
    public Dog(){ 
        super.category = "Dog";
    }
    public void showCategoryName(){
        super.showCategoryName();
        System.out.println("I'm wonderful " + this.category);
    }
    public void sound() {
        System.out.println("Woof!!");
    }
}
