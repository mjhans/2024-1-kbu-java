package com.kbu.java.example.ch08.InheritanceShape;

public class Point {
    private int x;
    private int y;

    Point(){
        this(0, 0);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String getPointInfo(){
        return String.format("(%s, %s)", this.x, this.y);
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}