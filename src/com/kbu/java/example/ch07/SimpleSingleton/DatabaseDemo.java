package com.kbu.java.example.ch07.SimpleSingleton;

public class DatabaseDemo {
    public static void main(String[] args) {
        DatabaseConnection dbconn = DatabaseConnection.getInstance();
        dbconn.connect();

        DatabaseConnection anotherDbconn = DatabaseConnection.getInstance();
        anotherDbconn.connect();

        //DatabaseConnection anotherDbconn2 = new DatabaseConnection();

    }
}
