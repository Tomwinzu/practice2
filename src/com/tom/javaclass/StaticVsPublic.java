package com.tom.javaclass;

public class StaticVsPublic {

    static void  MyStaticMethods() {

        System.out.println(" Static methods can be called without creating objects");
    }

    public void MyPublicMethods() {

        System.out.println("Public methods must be called by creating objects");

    }

    public static void main(String[] args) {

                MyStaticMethods();
                StaticVsPublic myobj=new StaticVsPublic();
                myobj.MyPublicMethods();




    }

}
