package com.tom.javaclass;

public class AttribteValueOverride {
    int x=10;

    public static void main(String[] args) {
        AttribteValueOverride myobj=new AttribteValueOverride();
        myobj.x=100;
        System.out.println(myobj.x);
    }
}
