package com.hyperGrid.javaBrushUp;

import org.testng.annotations.Test;

public class InheritanceTest extends HGBase{

    public static void main(String[] args) {
        InheritanceTest inheritanceTest = new InheritanceTest();
        inheritanceTest.bookTickets();
    }

    @Test
    public void verifyInheritance(){
        bookTickets();
    }
}
