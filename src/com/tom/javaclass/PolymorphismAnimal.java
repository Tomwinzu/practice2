package com.tom.javaclass;
 class PolymorphismAnimal {

        public void animalSound() {
            System.out.println("The animal makes a sound");

        }
    }
    class Pig extends PolymorphismAnimal {
        public void animalSound(){
            System.out.println("The pig says: wee wee");
        }

    }
    class Dog extends PolymorphismAnimal{

        public void animalSound() {
            System.out.println("  The dog says: bow wow");
        }

    }
    class  Main {
        public static void main(String[] args) {
            PolymorphismAnimal myAnimal = new PolymorphismAnimal();
           Pig myPig = new Pig();
       Dog myDog = new Dog();

            myAnimal.animalSound();
            myPig.animalSound();
            myDog.animalSound();

        }

    }

