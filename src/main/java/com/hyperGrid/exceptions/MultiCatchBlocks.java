package com.hyperGrid.exceptions;

public class MultiCatchBlocks {

    public static void main(String[] args) {
        int a = 0;
        try{
            a= 5/1;
            int[] b = {1,2,3,4,99};
            System.out.println(b[4]);
            System.out.println(b[5]);
        }catch (ArithmeticException ae){
            a = 5/1;
        }catch (ArrayIndexOutOfBoundsException aei){
            System.out.println("Provide right index within the length of the array");
        }
        System.out.println("a value :: "+ a);
        System.out.println("Automation Testing");
    }
}
