package com.tom.W3C.Javamethods;

public class OverloadingOneMethodsName {
    static int overloading(int x,int y) {
        return x+y;}
    static double overloading(double x,double y){
       return x+y;
   }

    public static void main(String[] args) {
        //int mynumber1 = overloading(10,20);
        //double mynumber2=overloading(12.09,10.10);
        //System.out.println("int:"+ mynumber1);
        //System.out.println("Double"+ mynumber2);
         System.out.println("Int:"+overloading(10,20));
        System.out.println("Double:"+overloading(12.09,10.10));

    }
}



