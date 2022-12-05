package com.tom.javaclass;
import java.util.HashSet;
public class Hashset {

        public static void main(String[] args) {
            HashSet<String> cars = new HashSet<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("BMW");
            cars.add("Mazda");
            System.out.println(cars);
            System.out.println(cars.contains("BMW"));
            System.out.println(cars.size());

        }
    }
