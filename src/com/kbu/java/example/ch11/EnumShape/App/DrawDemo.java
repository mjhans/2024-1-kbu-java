package com.kbu.java.example.ch11.EnumShape.App;

import com.kbu.java.example.ch11.EnumShape.Constants.*;
import com.kbu.java.example.ch11.EnumShape.impl.*;
import com.kbu.java.example.ch11.EnumShape.*;

public class DrawDemo {
    static Shape createShape(ShapeType shapeType, Point ... points){
        Shape result = switch(shapeType){
            case LINE -> new Line(points[0], points[1]);
            case RECTANGLE -> new Rectangle(points[0], points[1], points[2], points[3]);
            case TRIANGLE -> new Triangle(points[0], points[1], points[2]);
            //case LINE -> new Line(points[0], points[1]);
            default -> new Line(points[0], points[1]);            
        };

        return result;
    }
    public static void main(String[] args){

        Line line1 = (Line)createShape( ShapeType.LINE ,new Point(3,4), new Point(1, 2));
        Triangle triangle1 = (Triangle)createShape(ShapeType.TRIANGLE, new Point(1,1), new Point(3,4), new Point(5,1));
        Rectangle rectangle1 = (Rectangle) createShape(ShapeType.RECTANGLE, new Point(1,1), new Point(4,4), new Point(1,4), new Point(4, 1));

        DrawPane drawPane = new DrawPane();

        drawPane.addShape(line1, triangle1, rectangle1);
        drawPane.Draw();
        line1.setColor("Blue");
        triangle1.setColor("Red");
        rectangle1.setColor("white");
        drawPane.Paint();

        line1.setColor("black");
        drawPane.Paint();
    }
}
