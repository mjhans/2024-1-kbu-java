package com.kbu.java.example.ch08.UseAbstract;

public abstract class AbstractAnimal {
    protected String category = "";
    public AbstractAnimal(){
        this("Animal");
    }
    public AbstractAnimal(String category){
        this.category = category;
    }
    public abstract void sound();
    public void showCategoryName(){
        System.out.println(this.category + " category");
    }
}
