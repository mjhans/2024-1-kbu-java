package com.kbu.java.example.Homework.RTSGame.Stores;

import com.kbu.java.example.Homework.RTSGame.Units.Unit;
import com.kbu.java.example.Homework.RTSGame.Units.impl.*;
import com.kbu.java.example.Homework.RTSGame.Units.UnitType;
import com.kbu.java.example.Homework.RTSGame.Utils.Point;

public class GriffinChamber extends UnitStore {

    @Override
    public Unit createUnit(UnitType unitType, Point defaulPoint) throws Exception {
        Unit unit = null;
        if (unitType == UnitType.GRIFFIN) {
            unit = new Griffin(defaultPoint);
        } else {
            throw new IllegalArgumentException("Invalid unit type");
        }

        return unit;
    }

    @Override
    public boolean isCreateable(UnitType unitType) {
        return unitType == UnitType.GRIFFIN;
    }

}
