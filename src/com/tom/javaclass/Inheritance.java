package com.tom.javaclass;

 class Inheritance {

     protected String brandName = "Ford";

     public void Honk() {
         System.out.println("Tuut,tuut!");
     }
 }
      class Car extends Inheritance {

          private String modelName = "Mustang";

    public static void main(String[] args) {

      Car  myCar = new Car();
        myCar.Honk();

        System.out.println(myCar.brandName+" " +myCar.modelName);
    }

    }

