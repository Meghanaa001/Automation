package com.hyperGrid.programs;

public class ReverseAString {

    public static void main(String[] args) {
        String s = "selenium";
        char[] c = s.toCharArray();

        for (int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i));
        }

        System.out.println();
        System.out.println("**********************");

        for (int j=s.length()-1; j>=0; j--){
            System.out.print(s.charAt(j));
        }

        System.out.println();
        System.out.println("**************************");

        for (int k=c.length-1; k>=0; k--){
            System.out.print(c[k]);
        }
    }
}
