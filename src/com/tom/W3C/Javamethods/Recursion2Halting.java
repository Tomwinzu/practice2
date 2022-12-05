package com.tom.W3C.Javamethods;

public class Recursion2Halting {
    public static void main(String[] args) {

         int result = sum(5,10);

        System.out.println(result);}

public static int sum(int start,int end ){

        if (start<end )  {
  return end + sum(start,end-1);
           // return start +sum(start+1,end); //result =45

        }
        else {
            return start;
// return 0 result=40
            }
}

    }


