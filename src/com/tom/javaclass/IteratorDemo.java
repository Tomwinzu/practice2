package com.tom.javaclass;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {
            public static void main(String[] args) {

                ArrayList<String> cars = new ArrayList<String>();
                cars.add("Volvo");
                cars.add("BMW");
                cars.add("Ford");
                cars.add("Mazda");
                Iterator<String> carName = cars.iterator();

                System.out.println(carName.next());
            }
}
