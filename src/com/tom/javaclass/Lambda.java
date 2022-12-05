package com.tom.javaclass;

import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.forEach((i)->{
            System.out.println(i);
        });
    }


    }

