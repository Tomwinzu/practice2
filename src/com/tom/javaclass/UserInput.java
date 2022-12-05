package com.tom.javaclass;
 import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);

          String username;
            System.out.println("Enter Username");
            username=myobj.nextLine();
        System.out.println("Your username is " +username);

    }

}
