package com.tom.javaclass;

interface Animal4 {
    public void animalSound ();
        public void sleep();
}
class Pig4 implements Animal4 {
    public void animalSound () {
        System.out.println("The pig says: wee wee");
    }
public void sleep() {
    System.out.println("zzz");
}

}

public class Interface {
    public static void main(String[] args) {
  Animal4  myPig = new Pig4();
 myPig.animalSound();
 myPig.sleep();
    }
}
