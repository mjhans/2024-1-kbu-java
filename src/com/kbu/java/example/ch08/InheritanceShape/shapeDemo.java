package com.kbu.java.example.ch08.InheritanceShape;

public class shapeDemo {
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 2), new Point(5, 6));
        line.draw();
        line.setColor("red");
        line.paint();
        Triangle tri = new Triangle(new Point(1, 2), new Point(5, 6), new Point(1, 6));
        tri.draw();
        tri.setColor("blue");
        tri.paint();
    }
}
