package com.kbu.java.example.ch07;

class Account{
    String accountNo;
    String ownerName;
    long balance;

    public long deposit(long money){
        balance =+ money;
        return balance;
    }
    public long withdraw(long money){
        if (balance >= money){
            balance =- money;    
        } 
        return balance;        
    }

    public String getInfo(){
        return String.format("accountNo: %s, ownerName : %s, balance : %s", accountNo, ownerName, balance);
    }
}

class AccountDemo {
    public static void main(String[] args) {
        Account account01 = new Account();
        account01.accountNo = "01";
        account01.ownerName = "sam";
        account01.balance = 12;
        System.out.println(account01.getInfo());

        Account account02 = new Account();
        account02.accountNo = "01";
        account02.ownerName = "sam";
        account02.balance = 20;
        System.out.println(account02.getInfo());

        Account account03 = new Account();
        account03.accountNo = "01";
        account03.ownerName = "sam";
        account03.balance = 30;
        System.out.println(account03.getInfo());

    }
}
