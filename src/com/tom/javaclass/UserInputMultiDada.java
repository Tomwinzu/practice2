package com.tom.javaclass;

import java.util.Scanner;

public class UserInputMultiDada {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        String usename;
        int age;
        double salary;
        System.out.println("Please enter your username,age,salary:");
        usename=myobj.nextLine();
        age=myobj.nextInt();
        salary=myobj.nextDouble();
        System.out.println("Your username: "+usename);
        System.out.println("Your age: "+age);
        System.out.println(("Your salary: "+ salary));
    }
}
