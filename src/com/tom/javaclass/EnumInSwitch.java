package com.tom.javaclass;

enum Level1{
    LOW,
    MEDIUM,
    HIGH
}
public class EnumInSwitch {
    public static void main(String[] args) {
       Level1 myLevel = Level1.MEDIUM;
        switch (myLevel) {
            case LOW:
                System.out.println("Level Low");
                break;
            case MEDIUM:
                System.out.println("Level Medium");
                break;
            case HIGH:
                System.out.println("Level High");
                break;
        }
    }
}
