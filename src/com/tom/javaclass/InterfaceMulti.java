package com.tom.javaclass;
interface FirstInterface {
    public void myMethods();
}
interface  OtherInterface {
    public  void myOtherMethods();
}
class DemoClass implements FirstInterface, OtherInterface {
    public void myMethods() {
        System.out.println("Some text...");
    }
    public void myOtherMethods () {
        System.out.println("Some other text...");
    }
}

class InterfaceMulti {
    public static void main(String[] args) {
        DemoClass myobj = new DemoClass();
        myobj.myMethods();
        myobj.myOtherMethods();
    }
}