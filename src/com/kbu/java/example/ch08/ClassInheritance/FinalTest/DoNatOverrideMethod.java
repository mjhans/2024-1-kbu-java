package com.kbu.java.example.ch08.ClassInheritance.FinalTest;

public class DoNatOverrideMethod extends Bar{
    // void useBar(){

    // }
    
    void userBar(int n){
        super.useBar(n);
        
        super.useBar();
        this.useBar();
    }

}
