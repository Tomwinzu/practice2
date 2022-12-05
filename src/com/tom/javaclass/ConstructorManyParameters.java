package com.tom.javaclass;

public class ConstructorManyParameters {
  int modelyear;
  String modelname;

    public ConstructorManyParameters(int year,String name){
    modelname=name;
      modelyear =year;
        }

    public static void main(String[] args) {
      ConstructorManyParameters mycar=new ConstructorManyParameters(1975, "BMW");
        System.out.println(mycar.modelyear +" " + mycar.modelname);
    }
}
