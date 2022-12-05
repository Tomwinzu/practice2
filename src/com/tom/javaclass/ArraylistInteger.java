package com.tom.javaclass;

import java.util.ArrayList;

public class ArraylistInteger {

            public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(10);
            numbers.add(20);
            numbers.add(40);
            numbers.add(50);

            for (int n : numbers)

            System.out.println(n);

        }
    }