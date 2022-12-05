package com.tom.W3C.Javamethods;

public class Recursion1 {
    public static void main(String[] args) {
        int result = sum1(-10);
        System.out.println(result);
    }

    public static int sum1(int k) {

        if (k <0) {
            return k + sum1(k + 1);

                    } else {
            return 0;
        }
    }
}


