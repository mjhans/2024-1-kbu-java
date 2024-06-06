package com.kbu.java.example.Homework.RTSGame.Utils;

public final class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public String toString(){
        return String.format("(%s, %s)", this.x, this.y);
    }
}
