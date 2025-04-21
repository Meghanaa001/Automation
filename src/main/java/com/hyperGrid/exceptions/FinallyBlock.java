package com.hyperGrid.exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Try Block");
            int[] b = {1,2,3,4,99};
            System.out.println(b[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catch block");
        } finally {
            System.out.println("Mandatory block");
        }
    }
}
