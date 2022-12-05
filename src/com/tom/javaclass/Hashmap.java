package com.tom.javaclass;

import java.util.Collections;
import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<String,String>();


                capitalCities.put("AU", "Caberra");
                capitalCities.put("Germany", "Berlin");
                capitalCities.put("Norway", "Oslo");
                capitalCities.put("USA", "Washington DC");

                System.out.println(capitalCities);
        System.out.println(capitalCities.get("AU"));
        System.out.println(capitalCities.remove("USA"));
        System.out.println(capitalCities);
            }
        }

