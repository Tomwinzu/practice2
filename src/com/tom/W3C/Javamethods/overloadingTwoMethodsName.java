package com.tom.W3C.Javamethods;

public class overloadingTwoMethodsName {
    static int overloadingInt(int x,int y) {
    return x+y;}
    static double overloadingDouble(double x,double y){
        return x+y;
    }

    public static void main(String[] args) {
  int mynumber1 = overloadingInt(10,20);
  double mynumber2=overloadingDouble(12.09,10.10);
        System.out.println("int:"+ mynumber1);
        System.out.println("Double"+ mynumber2);
       // System.out.println("Int:"+overloadingInt(10,20));
       // System.out.println("Double:"+overloadingDouble(12.09,10.10));

    }
}

