package com.kbu.java.example.Homework.RTSGame.Stores;

import com.kbu.java.example.Homework.RTSGame.Units.*;
import com.kbu.java.example.Homework.RTSGame.Units.impl.*;
import com.kbu.java.example.Homework.RTSGame.Utils.Point;

public class AirPort extends UnitStore{

    @Override
    public Unit createUnit(UnitType unitType, Point defaulPoint) throws Exception {
        Unit unit = null;
        if (unitType == UnitType.SHUTTLE){
            unit = new Shuttle(defaultPoint);
        } else {
            throw new IllegalArgumentException("Invalid unit type");
        }
        return unit;
    }

    @Override
    public boolean isCreateable(UnitType unitType) {
        return unitType == UnitType.SHUTTLE;
    }
    

}
