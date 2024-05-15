package com.kbu.java.example.ch08.SimpleAbstract;


public class AdvancedAnimalDemo {
    public static void main(String[] args){
        AdvancedDog dog = new AdvancedDog();
        dog.sound();
        dog.showCategoryName();
        
        AdvancedCat cat = new AdvancedCat();
        cat.sound();
        cat.showCategoryName();
    }
}
