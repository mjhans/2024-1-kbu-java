package com.kbu.java.example.ch11.EnumShape;

import com.kbu.java.example.ch11.Generic.*;
public abstract class Shape extends PrintableShape implements Drawble, Paintable{
//public abstract class Shape implements Drawble, Paintable{
    protected String color = "";
    public void setColor(String color){
        this.color = color;
    }
}
