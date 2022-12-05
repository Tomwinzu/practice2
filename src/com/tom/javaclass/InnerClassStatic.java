package com.tom.javaclass;
class OutClass {
    int x=10;
 static  class InnerClass{
        int y=20 ;   }
}
    public class InnerClassStatic {
        public static void main(String[] args) {

              OutClass.InnerClass myInner =new OutClass.InnerClass();
            System.out.println(myInner.y);
        }


    }










