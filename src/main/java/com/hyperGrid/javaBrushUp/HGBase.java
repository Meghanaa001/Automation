package com.hyperGrid.javaBrushUp;

public class HGBase {

    private int id = 120;
    private String name="Hyper";


    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }
    public static void payment(){
        System.out.println("Payment");
    }

    public void bookTickets(){
        System.out.println("BookTickets");
    }

    public String getMessage(){
        System.out.println("Message");
        return "Message";
    }
}
