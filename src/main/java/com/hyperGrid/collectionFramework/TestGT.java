package com.hyperGrid.collectionFramework;

public class TestGT {

    public static void main(String[] args) {
        GenericsTest<Integer> genericsTest = new GenericsTest<>(10);
        GenericsTest<String> genericsTest1 = new GenericsTest<>("String");
        GenericsTest<Character> genericsTest2 = new GenericsTest<>('c');
    }
}
