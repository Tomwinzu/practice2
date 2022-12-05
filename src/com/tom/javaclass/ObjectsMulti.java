package com.tom.javaclass;

public class ObjectsMulti {

    int x=5,y=10;

    public static void main(String[] args) {

        ObjectsMulti myobj1 = new ObjectsMulti();
        ObjectsMulti myobj2 = new ObjectsMulti();

        System.out.println(myobj1.x);
        System.out.println(myobj2.y);
        System.out.println(myobj1.y+myobj2.x);
    }

}
