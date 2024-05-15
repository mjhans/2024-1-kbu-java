package com.kbu.java.example.ch08.SimpleAbstract;

public abstract class AdvancedAnimal {
    private String category = "";
    
    public AdvancedAnimal(){
        this("Animal");
    }
    public AdvancedAnimal(String category){
        this.category = category;
    }

    public abstract void sound();

    public void showCategoryName(){
        System.out.println(this.category + " category");
    }
}
