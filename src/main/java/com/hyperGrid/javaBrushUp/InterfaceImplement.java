package com.hyperGrid.javaBrushUp;

public class InterfaceImplement implements InterfaceDef{
    @Override
    public void bookTicket() {
        System.out.println("BookTicket");
    }

    @Override
    public void payment() {
        System.out.println("Payments");
    }
}
