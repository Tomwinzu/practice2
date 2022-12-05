package com.tom.javaclass;

import java.util.ArrayList;

public class ForEachLoop {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (String car : cars)
            System.out.println(car);

    }
}