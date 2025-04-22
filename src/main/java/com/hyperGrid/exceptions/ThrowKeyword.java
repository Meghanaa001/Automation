package com.hyperGrid.exceptions;

public class ThrowKeyword {


    public void test1(){
        int i =0;
        try{
            i = 5/i;
            System.out.println("Test 1 Passed");
        }catch (ArithmeticException ae){
//            ae.printStackTrace();
            System.out.println("Test 1 Fail");
            throw new ArithmeticException();
        }
    }

    public void test2(){
        try{
            int[] a= {1,3,5,6,7};
            System.out.println(a[5]);
            System.out.println("Test 2 Passed");
        }catch (ArrayIndexOutOfBoundsException ae){
           // ae.printStackTrace();
            System.out.println("Test 2 Fail");
            throw new ArrayIndexOutOfBoundsException("Provide right index");
        }
    }

    public static void main(String[] args) {
        ThrowKeyword throwKeyword = new ThrowKeyword();
        throwKeyword.test1();
        System.out.println("Test 1 Completed");
        throwKeyword.test2();

    }
}
