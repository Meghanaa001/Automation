package com.hyperGrid.dataManager;

import java.io.Serializable;

public class EmployeeDetails implements Serializable {
    public int id ;
    public String name;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
