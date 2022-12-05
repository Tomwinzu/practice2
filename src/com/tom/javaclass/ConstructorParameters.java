package com.tom.javaclass;

public class ConstructorParameters {

    int x;
    public ConstructorParameters(int y) {

        x=y;
    }

    public static void main(String[] args) {
        ConstructorParameters myobj=new ConstructorParameters(10);
        System.out.println(myobj.x);
    }
}
