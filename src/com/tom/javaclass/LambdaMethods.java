package com.tom.javaclass;
interface  StringFunction{
    String run (String Str);
}

public class LambdaMethods {
    public static void main(String[] args) {

        StringFunction claim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";

    printFormatted("Hellow",claim);

    printFormatted("Hellow",ask);

}

    public static void printFormatted(String Str,StringFunction format ){
        String result=format.run(Str);
        System.out.println(result);
    }
}
