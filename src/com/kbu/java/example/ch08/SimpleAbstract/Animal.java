package com.kbu.java.example.ch08.SimpleAbstract;

public abstract class Animal {
    protected String category = "";
    
    public abstract void sound();

    public void showCategoryName(){
        System.out.println(this.category + " category");
    }
}
