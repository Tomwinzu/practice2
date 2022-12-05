package com.tom.W3C.Javamethods;

public class MethodsIfElse {
 static void checkAge(int x) {
     if (x < 18) {
         System.out.println("Access denied -your age are not old enough," + " your age is " + x+'.');

     } else {
         System.out.println("Access granted-your age are old enough,"+" your age is " + x+'.');
     }

 }
    public static void main(String[] args) {
       checkAge(20);
       checkAge(12);
    }


 }