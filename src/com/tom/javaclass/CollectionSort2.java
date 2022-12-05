package com.tom.javaclass;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort2 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(100);
        numbers.add(16);
        numbers.add(50);
        Collections.sort(numbers);
        for (int n : numbers)

            System.out.println(n);
    }
}