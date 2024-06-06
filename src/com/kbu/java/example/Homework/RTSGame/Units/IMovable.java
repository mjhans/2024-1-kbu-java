package com.kbu.java.example.Homework.RTSGame.Units;

import com.kbu.java.example.Homework.RTSGame.Utils.Point;

public interface IMovable {
    Point moveTo(Point destination) throws Exception;
}
