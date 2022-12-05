package com.tom.javaclass;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorLoop {
    public static void main(String[] args) {
        ArrayList<String> cars1 = new ArrayList<String>();
        cars1.add("Volvo");
        cars1.add("BMW");
        cars1.add("Ford");
        cars1.add("Mazda");

        Iterator<String> myCar= cars1.iterator();
        while (myCar.hasNext()){
            System.out.println(myCar.next());
        }
    }


}
