package com.hyperGrid.arrays;

public class ArraysTest4 {

    public static void main(String[] args) {
        int[] a = {1,2,4};
        int[][] numberSets =  {{1,2,4},
                               {5,6,8}};

        System.out.println(numberSets[0][0]);
        System.out.println(numberSets[0][2]);
        System.out.println(numberSets[1][2]);
        System.out.println("*******************************");

        System.out.println(numberSets.length);


        for (int i=0; i<numberSets.length; i++){
            for (int j=0; j<numberSets[i].length; j++){
                System.out.println(numberSets[i][j]);
            }
        }


        for (int[] k: numberSets ){
            System.out.println(k.length);
            for (int l: k){
                System.out.print(l);
            }
        }

    }
}
