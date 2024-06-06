package com.kbu.java.example.Homework.RTSGame.Play;

import java.util.*;

import com.kbu.java.example.Homework.RTSGame.Units.*;
import com.kbu.java.example.Homework.RTSGame.Utils.Point;
import com.kbu.java.example.Homework.RTSGame.Stores.*;

public class Player {
    protected String playerName;
    protected ArrayList<Unit> ownedUnits;
    protected ArrayList<Unit> selectedUnits;
    protected ArrayList<UnitStore> ownedStores;

    public Player(String playerName) {
        this.playerName = playerName;
        this.ownedUnits = new ArrayList<Unit>();
        this.selectedUnits = new ArrayList<Unit>();
        this.ownedStores = new ArrayList<UnitStore>();
    }
    public String getPlayerName() {
        return this.playerName;
    }
    public ArrayList<Unit> CreateUnits(UnitType unitType, int count, Point point) throws Exception {
        ArrayList<Unit> createdUnit = new ArrayList<Unit>();   
        for (UnitStore store : ownedStores) {
            if (store.isCreateable(unitType)) {
                for (int i = 0; i < count; i++) {
                    Unit unit = store.createUnit(unitType, point);
                    unit.setUnitName(String.format("%04d", i));
                    unit.setOwner(this);
                    ownedUnits.add(unit);
                    createdUnit.add(unit);
                }            
            }
        }
        return createdUnit;        
    }
    protected void addOwnedUnits(Unit ... units) {
        ownedUnits.addAll(Arrays.asList(units));
    }
    // public void addUnit(Unit unit) {
    //     this.ownedUnits.add(unit);
    // }

    public void removeOwnedUnits(Unit ... units) {
        ownedUnits.removeAll(Arrays.asList(units));
    }
    // public void removeUnit(Unit unit) {
    //     this.ownedUnits.remove(unit);
    // }

    protected void addOwnedStores(UnitStore ... stores) {
        ownedStores.addAll(Arrays.asList(stores));
    }

    public void createUnitStore(StoreType storeType) {
        UnitStore store = switch (storeType) {
            case BARRACK -> new Barracks();
            case AIRPORT -> new AirPort();
            case GRIFFINCHAMBER -> new GriffinChamber();
        };
        addOwnedStores(store);
    }

    public void removeStores(UnitStore ... stores) {
        ownedStores.removeAll(Arrays.asList(stores));
    }

    public ArrayList<Unit> selectUnits(Unit ... units) {
        return this.selectUnits(new ArrayList<Unit>(Arrays.asList(units)));
    }
    public ArrayList<Unit> selectUnits(ArrayList<Unit> units) {
        this.selectedUnits.clear();        
        return this.AddSelectUnits(units);
    }

    public ArrayList<Unit> AddSelectUnits(Unit ... units) {
        return this.AddSelectUnits(new ArrayList<Unit>(Arrays.asList(units)));
    }   
    public ArrayList<Unit> AddSelectUnits(ArrayList<Unit> units) {
        this.selectedUnits.addAll(units);
        return this.selectedUnits;
    }

    public void unSelectedUnits(Unit unit) {
        this.selectedUnits.remove(unit);
    }
    public void unSelectedUnits(ArrayList<Unit> units) {
        this.selectedUnits.removeAll(units);
    }
    public ArrayList<Unit> getSelectedUnits() {
        return this.selectedUnits;
    }

    public ArrayList<Unit> moveUnits(Point destination) throws Exception {
        ArrayList<Unit> movedUnits = new ArrayList<Unit>();
        for (Unit unit : this.selectedUnits) {
            if (ownedUnits.contains(unit) && unit instanceof IMovable) {
                movedUnits.add(unit);
                ((IMovable)unit).moveTo(destination);
            }
        }
        return movedUnits;
    }

    public ArrayList<Unit> attackUnits(ArrayList<Unit> targets) throws Exception {
        ArrayList<Unit> attackedUnits = new ArrayList<Unit>();
        for (Unit unit : this.selectedUnits) {
            if (ownedUnits.contains(unit) && unit instanceof IAttackable) {
                attackedUnits.add(unit);
                ((IAttackable)unit).attack(targets);
            }
        }
        return attackedUnits;
    }


}
