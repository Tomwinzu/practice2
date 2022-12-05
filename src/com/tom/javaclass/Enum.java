package com.tom.javaclass;

enum  Level{
    LOW,
    Medium,
    High
}
public class Enum {
    public static void main(String[] args) {
       Level myLevel = Level.Medium;
        System.out.println(myLevel);
    }
}
