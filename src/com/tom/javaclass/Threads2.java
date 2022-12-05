package com.tom.javaclass;


    public class Threads2 extends Thread{
        public static void main(String[] args) {
         Threads2 myobj= new Threads2();
         Thread threads2=new Thread(myobj);
            threads2.start();
            System.out.println("This code is outside of the thread");
        }
        public void run() {
            System.out.println("This code is running in a thread");
        }

    }

