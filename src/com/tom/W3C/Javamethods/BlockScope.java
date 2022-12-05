package com.tom.W3C.Javamethods;

public class BlockScope {

    public static void main(String[] args) {
        // code here cannot use x
        { // this is a block
            // code here cannot use x
            int x = 100;
        // code here can use x
        System.out.println(x);}
    }
    // block end here
}