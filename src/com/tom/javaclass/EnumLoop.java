package com.tom.javaclass;

enum Level3{
    LOW,
    MEDIEM,
    HIGH
}
public class EnumLoop {
    public static void main(String[] args) {
             for (Level3 myLevel : Level3.values()) {
        System.out.println(myLevel);}
}
}
