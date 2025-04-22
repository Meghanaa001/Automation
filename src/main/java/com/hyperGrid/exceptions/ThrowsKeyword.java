package com.hyperGrid.exceptions;

public class ThrowsKeyword {

    public static void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void sleep(int timeInMilliSecs) throws InterruptedException {
        Thread.sleep(timeInMilliSecs);
    }

    public static void sleep(int a, int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args)  {
        sleep(5, 1000);
        try {
            sleep();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
