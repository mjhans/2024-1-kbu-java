package com.kbu.java.example.ch11.EnumShape;

public abstract class Shape implements Drawble, Paintable{
    protected String color = "";
    public void setColor(String color){
        this.color = color;
    }
}
