package com.kbu.java.example.Homework.RTSGame.Units;

import java.util.ArrayList;

public interface IAttackable {
    ArrayList<Unit> attack(ArrayList<Unit> targets) throws Exception;
}
