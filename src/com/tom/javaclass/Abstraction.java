package com.tom.javaclass;
abstract class Animal{
    public abstract void animalSound();
    public void  sleep() {
        System.out.println("The sleep sound is zzz");
    }

}
class Pig3 extends Animal {
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }

}

public class Abstraction {
    public static void main(String[] args) {

        Pig3 myPig = new Pig3();
        myPig.animalSound();
        myPig.sleep();

    }
}




