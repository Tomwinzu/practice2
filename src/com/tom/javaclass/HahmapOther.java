package com.tom.javaclass;

import java.util.HashMap;

public class HahmapOther {
    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("Tom", 40);
        people.put("Stevel", 50);
        people.put("John", 20);
        for (String name : people.keySet()) {
            System.out.println("Name: " + name + "  Age: " + people.get(name));

        }

    }

}
