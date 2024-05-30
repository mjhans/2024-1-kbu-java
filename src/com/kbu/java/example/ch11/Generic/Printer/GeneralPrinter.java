package com.kbu.java.example.ch11.Generic.Printer;

import com.kbu.java.example.ch11.Generic.Printable;
public class GeneralPrinter <T> {

    private T item;
    public void setItem(T item){
        this.item = item;
    }
    public void print(){
        ((Printable)this.item).Print();
    }    
}
