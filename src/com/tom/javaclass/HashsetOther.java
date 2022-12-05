package com.tom.javaclass;

import java.util.HashSet;

public class HashsetOther {
    public static void main(String[] args) {
        HashSet<Integer> numbers=new HashSet<Integer>();
        numbers.add(2);
        numbers.add(6);
        numbers.add(10);

        for (int i = 0; i <= 10; i++) {
            if (numbers.contains(i) ) {
                System.out.println(i + " was found in the set.");
            }
            else {
                System.out.println(i + " was not found in the set.");
            }

        }
    }
}
