package com.tom.javaclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegEx {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("Google",Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher("Visit google website");
        boolean matchfind=matcher.find();
        if (matchfind) {
            System.out.println("Match found");
        } else {
            System.out.println("not match found");
        }
    }
}
