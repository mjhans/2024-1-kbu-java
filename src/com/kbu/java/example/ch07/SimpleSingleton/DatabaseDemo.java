package com.kbu.java.example.ch07.SimpleSingleton;

public class DatabaseDemo {
    public static void main(String[] args) {
        DatabaseConnection dbconn = DatabaseConnection.getInstance();
        dbconn.connect();

        DatabaseConnection anotherDbconn01 = DatabaseConnection.getInstance();
        anotherDbconn01.connect();

        //DatabaseConnection anotherDbconn2 = new DatabaseConnection();

        DatabaseConnection anotherDbconn02 = DatabaseConnection.getInstance();
        anotherDbconn02.connect();

    }
}
