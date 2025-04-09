package com.hyperGrid.strings;


import org.apache.commons.lang3.StringUtils;

public class StringComparisions {

    public static void main(String[] args) {
        String s = "Selenium";
        String s1 = "Selenium";
        String s2 = new String("Selenium");
        String s3 = new String("Selenium");

        System.out.println(s == s1); // true
        System.out.println(s == s2); // false

        System.out.println("**************************");
        System.out.println(s.equals(s1)); // true
        System.out.println(s.equals(s2)); // true


        System.out.println("**************************");
        System.out.println(s2 == s3); // false
        System.out.println(s2.equals(s3)); // true


        System.out.println("**************************");
        String str = "Welcome to BrowserStack meetup on April 26th, AI for everyone";
        System.out.println(str.contains("browserStack"));
        System.out.println(str.contains("Welcome to BrowserStack"));
        System.out.println(str.contains("Welcome"));

        System.out.println(str.startsWith(" Welcome"));// false
        System.out.println(str.startsWith("Welcome"));
        System.out.println(str.endsWith("AI for everyone"));

        System.out.println(s.length());
        System.out.println("**************************");
        String s5 = " Testing AI tool                 ";
        String s6 = "                                        Playwright AI tool      test           c";
        System.out.println(s5.length());
        System.out.println(s5.equals("Testing AI tool"));
        System.out.println(s5.trim().length());
        System.out.println(s5.trim().equals("Testing AI tool"));

        System.out.println("**************************");
        System.out.println(s6.length());
        String s7 = StringUtils.normalizeSpace(s6);
        System.out.println(s7.length());

        System.out.println("**************************");
        char[] chr = s.toCharArray();
        System.out.println(chr);

        System.out.println(chr[0]);

        for (int i=0; i<chr.length; i++){
            System.out.println(chr[i]);
        }

        String s8 = "K";
        char c1 = 'K';
        System.out.println("**************************");
        System.out.println(str.substring(10));
        System.out.println(str.substring(10, 20));

        System.out.println(str.indexOf("BrowserStack"));
    }
}
