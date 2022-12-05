package com.tom.javaclass;

public class ThreadsConcurrencyProblems extends Thread {
    public  static int amount=2;
    public static void main(String[] args) {
        ThreadsConcurrencyProblems thread =new ThreadsConcurrencyProblems();
        thread.start();
        while(thread.isAlive()) {
        System.out.println("Waitting:");}
        System.out.println("Main "+amount);
          amount++;
        System.out.println("Main: "+amount);
            }
            public void run() {
                amount++;
            }
}
