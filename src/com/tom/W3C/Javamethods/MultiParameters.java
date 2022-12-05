package com.tom.W3C.Javamethods;

public class MultiParameters {
    public static void methodsParameters(String fname, int age) {

        System.out.println(fname + " Wang" + " " + "is" + " " + age+'.');
    }

    public static void main(String[] args) {
        methodsParameters("Tom", 40);
        methodsParameters("Dorjear", 35);
        methodsParameters("Gang", 75);
    }
}