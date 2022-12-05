package com.tom.javaclass;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaConsumer {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        Consumer<Integer> myobj=(i) ->{
            System.out.println(i);};
            numbers.forEach(myobj);

    }
}
