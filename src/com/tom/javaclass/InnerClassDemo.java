package com.tom.javaclass;

    class OutClass1 {
        int x = 5;

        class InnerClass1 {
            int y = 10;
        }
    }
   public class InnerClassDemo {
    public static void main(String[] args) {
        OutClass1 myOuter = new OutClass1();
        OutClass1.InnerClass1 myInner = myOuter.new InnerClass1();
        System.out.println(myOuter.x + myInner.y);
    }
}
