package com.hyperGrid.loopsAndConditions;

public class AboutIF {

    static boolean flag = false;
    static int age = 19;

    public static void main(String[] args) {

        if(age == 19){
            System.out.println("Eligible for Driving licence");
        } else if(age>19){
            System.out.println("Apply for Driving licence");
        }
        else if(age == 19){
            System.out.println("Eligible for Driving licence");
        } else {
            System.out.println("Not eligible");
        }
    }


    public void testIf(){
        if(true){
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
    }
}
