package com.tom.javaclass;

public class AttributeMultiClass {
    int x=10;

    public static void main(String[] args) {
        AttributeMultiClass myobj1=new AttributeMultiClass();
        AttributeMultiClass myobj2=new AttributeMultiClass();
        myobj2.x=100;
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);
    }
}
