package com.tom.javaclass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatting {
    public static void main(String[] args) {
        LocalDateTime mydateobj = LocalDateTime.now();
        System.out.println("Before Formatting: " + mydateobj);
      DateTimeFormatter myFormat= DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
     String FormatDate= mydateobj.format(myFormat);
        System.out.println("After Formatting:"+FormatDate);


    }



}
