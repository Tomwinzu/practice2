package com.tom.javaclass;

abstract class ModifiersAbstractMain {
    String name = "Jhon";
    int age = 24;
    int year = 2018;

    public abstract void study();
}

class Student extends ModifiersAbstractMain {

    public void study() {
        System.out.println(" Studying all day long");
    }

}
