package com.tom.javaclass;


import java.sql.SQLOutput;

public class EnumInsideClass {
    enum  Level{
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myLevel = Level.MEDIUM;
        System.out.println(myLevel);
    }
}
