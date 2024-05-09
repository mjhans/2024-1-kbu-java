package com.kbu.java.example.ch07.SimpleAccount;

public class Account {
    private String accountNo;
    private String ownerName;
    private long balance;

    Account(String accountNo, String ownerName){
        this(accountNo, ownerName, 0l);
    }

    Account(String accountNo, String ownerName, long balance){
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return this.accountNo;
    }

    public long deposit(long money){
        balance =+ money;
        return balance;
    }
    public long withdraw(long money){
        if (balance >= money){
            balance -= money;
        } 
        return balance;        
    }

    public String getInfo(){
        return String.format("accountNo: %s, ownerName : %s, balance : %s", accountNo, ownerName, balance);
    }
}
