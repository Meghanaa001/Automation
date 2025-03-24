package com.hyperGrid.oops.polymorphism;

public class Child  extends Parent{

    public static void main(String[] args) {
        Child child = new Child();
        child.bookTickets();
    }

    @Override
    public void bookTickets(){
        System.out.println("Select ");
        System.out.println("Book Tickets");
    }

    @Override
    public int sum(int a, int b){
        int c = a+b;
        return c;
    }
}
