package com.hyperGrid.dataManager;

import javax.sound.midi.Soundbank;
import java.io.*;

public class SerializationAndDeSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EmployeeDetails employeeDetails = new EmployeeDetails();

        employeeDetails.setId(500);
        employeeDetails.setName("Siva");

        String userDirectory = System.getProperty("user.dir");
        File file = new File(userDirectory+"\\src\\main\\resources\\empData.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employeeDetails);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        EmployeeDetails employeeDetails1 = null;
        employeeDetails1 = (EmployeeDetails) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        System.out.println(employeeDetails1.getId());
        System.out.println(employeeDetails1.getName());
    }
}
