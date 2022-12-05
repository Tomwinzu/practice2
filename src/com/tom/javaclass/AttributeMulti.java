package com.tom.javaclass;

public class AttributeMulti {
     int age =10;
     double price=20.10;
     String lname = "Wang";

    public static void main(String[] args) {
        AttributeMulti myobj=new AttributeMulti();
        System.out.println("My surname is " +myobj.lname+" and my age is " +myobj.age+" and i have one mobile which price is "+ myobj.price);
    }


}
