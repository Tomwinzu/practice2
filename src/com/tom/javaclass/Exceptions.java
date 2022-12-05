package com.tom.javaclass;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[]{1, 2, 5, 10};
            System.out.println(numbers[5]);
        } catch (Exception e) {
            System.out.println("Something go wrong");
        }finally {
            System.out.println("the try catatch is finished");
        }
    }
}
