package com.hyperGrid.oops.polymorphism;

public class OverRideTest {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.bookTickets();
        parent.sum(5,5);
    }
}
