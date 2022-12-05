package com.tom.javaclass;

public class Threads extends Thread{
    public static void main(String[] args) {
        Threads threads= new Threads();
        threads.start();
        System.out.println("This code is outside of the thread");
            }
            public void run() {
                System.out.println("This code is running in a thread");
            }

}

