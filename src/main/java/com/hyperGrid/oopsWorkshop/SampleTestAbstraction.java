package com.hyperGrid.oopsWorkshop;



public class SampleTestAbstraction extends ImplementTest {

    public static void main(String[] args) {
        TestInterface testInterface = new SampleTestAbstraction();
        testInterface.login();

        TestInterface1 testInterface1 = new SampleTestAbstraction();
        testInterface1.search();
    }
}
