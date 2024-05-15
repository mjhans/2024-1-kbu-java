package com.kbu.java.example.ch08.SimpleAbstract;

public class AdvancedDog extends AdvancedAnimal{
    
    public AdvancedDog(){ 
        super("AdvancedDog");
    }
    public void showCategoryName(){
        super.showCategoryName();
    }
    public void sound() {
        System.out.println("Woof!!");
    }
}
