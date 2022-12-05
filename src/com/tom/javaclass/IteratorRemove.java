package com.tom.javaclass;
import java.util.Iterator;
import java.util.ArrayList;

public class IteratorRemove {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> it= numbers.iterator();

        while(it.hasNext())  {
            int i= it.next();
            if (i <10){
                it.remove();

            }
        }
        System.out.println(numbers);
    }
}
