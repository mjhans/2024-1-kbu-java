package com.kbu.java.example.Homework.RTSGame.Stores;

import com.kbu.java.example.Homework.RTSGame.Units.*;
import com.kbu.java.example.Homework.RTSGame.Units.impl.*;
import com.kbu.java.example.Homework.RTSGame.Utils.Point;

public class Barracks extends UnitStore{

    @Override
    public Unit createUnit(UnitType unitType, Point defaulPoint) throws Exception {
        Unit unit = null;
        if (unitType == UnitType.ARCHER) {
            unit = new Archer(defaultPoint);
        } else if (unitType == UnitType.KNIGHT) {
            unit = new Knight(defaultPoint);
        } else {
            throw new IllegalArgumentException("Invalid unit type");
        }

        return unit;
    }

    @Override
    public boolean isCreateable(UnitType unitType) {
        return unitType == UnitType.ARCHER || unitType == UnitType.KNIGHT;
    }
    
}
