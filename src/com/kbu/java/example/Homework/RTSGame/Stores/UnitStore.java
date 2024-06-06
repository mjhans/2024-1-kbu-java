package com.kbu.java.example.Homework.RTSGame.Stores;

import com.kbu.java.example.Homework.RTSGame.Units.Unit;
import com.kbu.java.example.Homework.RTSGame.Units.UnitType;
import com.kbu.java.example.Homework.RTSGame.Utils.Point;

public abstract class UnitStore {
    protected Point defaultPoint = new Point(3, 3);
    public abstract Unit createUnit(UnitType unitType, Point defaulPoint) throws Exception;
    public abstract boolean isCreateable(UnitType unitType);
}
