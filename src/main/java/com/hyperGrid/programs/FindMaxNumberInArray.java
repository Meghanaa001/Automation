package com.hyperGrid.programs;

public class FindMaxNumberInArray {

    public static void main(String[] args) {
        int[] a = {99, 11, 88, 100, 109, 200, 1, 23, 4};

        int max = a[0];

        for (int i=0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }

        System.out.println(max);


    }
}
