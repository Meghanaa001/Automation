package com.hyperGrid.collectionFramework;

public class TestGT {

    public static void main(String[] args) {

        GenericsTest<String> genericsTest = new GenericsTest<String>("Selenium");
        GenericsTest<Character> genericsTest1 = new GenericsTest<Character>('c');
        GenericsTest<Integer> gt = new GenericsTest<>(10);
        GenericsTest<Character> genericsTest2 = new GenericsTest<>('c');
    }
}
