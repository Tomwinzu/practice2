package com.tom.javaclass;
import java.util.Collections;
import java.util.LinkedList;
public class Linkledlist {

    public static void main(String[] args) {
        LinkedList <String> cars = new LinkedList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
       cars.addFirst("Toyota");
       cars.addLast("Benz");
        Collections.sort(cars);
        System.out.println(cars);
        System.out.println(cars.getLast());
    }
}