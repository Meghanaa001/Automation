package com.hyperGrid.javaBrushUp;

public class EncapsulationTest extends HGBase{

    public static void main(String[] args) {
        EncapsulationTest encapsulationTest = new EncapsulationTest();

        encapsulationTest.setId(510);
        encapsulationTest.setName("Siva");

        System.out.println(encapsulationTest.getId());
        System.out.println(encapsulationTest.getName());
    }

}
