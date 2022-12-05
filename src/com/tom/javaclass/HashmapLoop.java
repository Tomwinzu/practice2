package com.tom.javaclass;

import java.util.HashMap;

public class HashmapLoop {

    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<String,String>();


        capitalCities.put("AU", "Caberra");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
      for (String  c: capitalCities.keySet()){
      // System.out.println(c);
        //for  (String v: capitalCities.values()){
            //System.out.println(v);
            System.out.println("Key: "+c+" Values: "+capitalCities.get(c));
        //}
    }
}
}

