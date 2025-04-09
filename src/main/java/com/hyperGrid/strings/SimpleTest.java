package com.hyperGrid.strings;

public class SimpleTest {

    public static void main(String[] args) {
        String str = "Java Automation";
        System.out.println(str + " 17.0");
        System.out.println(str.concat(" 21.0"));
        str.concat(" 21.0");
        System.out.println(str);

        str = str.concat(" 23.0");
        System.out.println(str);

        String str1 = new String("Test Automation");
        str1.concat("4.0");
        System.out.println(str1);

        StringBuffer sb = new StringBuffer("Selenium Automation");
        sb.append(" using TestNG");
        System.out.println(sb);



    }
}
