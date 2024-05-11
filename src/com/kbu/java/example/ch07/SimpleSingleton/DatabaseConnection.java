package com.kbu.java.example.ch07.SimpleSingleton;

import java.util.Random;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private int count = 0;

    private final String connectionName;

    private DatabaseConnection() {
        Random rnd = new Random();
        connectionName = String.format("conn #%s", rnd.nextDouble(100000.0));
        System.out.println("create object");
    }
    private void increaseCount(){
        this.count++;
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void connect() {
        increaseCount();
        System.out.println("Database connection established, count : " + this.count);
        System.out.println("connection name " + connectionName);
    }
}
