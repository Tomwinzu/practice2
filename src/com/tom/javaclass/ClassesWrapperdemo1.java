package com.tom.javaclass;
import java.util.ArrayList;
public class ClassesWrapperdemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(5);
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(30);
        for (int n : myNumbers) {
            System.out.println(n);
        }
    }
}


