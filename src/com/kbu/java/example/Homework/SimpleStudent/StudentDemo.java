package com.kbu.java.example.Homework.SimpleStudent;

public class StudentDemo {
    public static void main(String[] args) {
        Address schoolAddress = new Address("노원구", "서울시", "");
        
        Student s1 = new Student("james"
            , new Address("강남구", "서울시", "")
            , schoolAddress);

        System.out.println(s1.getStudentInfo());

        Student s2 = new Student("jimmy"
            , new Address("심사임당로", "강릉시", "강원도")
            , schoolAddress);

        System.out.println(s2.getStudentInfo());

    }
}
