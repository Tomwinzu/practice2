package com.tom.javaclass;

public class AccessMethodsWithObject {

         public void fullThrottle() {

             System.out.println("The car is going as fast as it can!");
        }
        public void speed(int maxspeed) {
            System.out.println("Max speed is:"+maxspeed);}

            public static void main(String[] args){

                AccessMultiClassMain mycar = new AccessMultiClassMain();
                mycar.fullThrottle();
                mycar.speed(200);

            }

            }
