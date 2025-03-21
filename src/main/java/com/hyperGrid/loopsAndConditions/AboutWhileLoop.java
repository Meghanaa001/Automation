package com.hyperGrid.loopsAndConditions;

public class AboutWhileLoop {
    public static void main(String[] args) {

        int a= 0;


        for(int k=0; k<5; k++){
            System.out.println(k);
        }

        while (a<5 && a<=5 || a ==10) {
            System.out.println(a);
            a++;
        }

        System.out.println("********************");
        int b=1;

        do{

            b++;
            System.out.println(b);
        }while (b>10);

    }
}
