package com.hyperGrid.loopsAndConditions;

public class Operators {

    public static void main(String[] args) {

        int a = 123;
        int b = 504374365;

        System.out.println(a%10);
        System.out.println(b%10);

        System.out.println(a/10);
        System.out.println(b/10);

        int c = 1;
        int d = 1;
        System.out.println("************************");
        System.out.println(c++);
        System.out.println(c);
        System.out.println(d++);
        System.out.println(d);

        int e = 1, f=1, k = 1;
        System.out.println(++e);
        System.out.println(e);

        System.out.println("************");
        int g = f++;
        System.out.println(g);
        System.out.println(f);

        int h = ++k;
        System.out.println(h);

        int a1 = 20, a2 = 20, a3=20;
        boolean b1 = a1>=a2;
        System.out.println(b1);

        boolean b2 = a2 == a3;
        System.out.println(b2);

        boolean b3 = a2<=a3;
        System.out.println(b3);

        System.out.println("****************************");
        boolean b4 = (a1 == a2) && (a2<a1);
        boolean b5 = (a1 > a2) && (a2<a1);
        boolean b6 = (a1 == a2) || (a2<a1);
        boolean b7 = (a1 > a2) || (a2<a1);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);



    }
}
