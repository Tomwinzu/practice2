package com.tom.javaclass;

import java.util.ArrayList;

import java.util.Collections;

public class CollectionSort1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);
        for (String c :cars)
        System.out.println(c);
    }
}