package com.hyperGrid.arrays;

public class ArraysTest2 {

    public static void main(String[] args) {

        int[] a = {11,22,44,66,77,99};

        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        for(int i:a){
            System.out.println(i);
        }
    }
}
