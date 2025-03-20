package com.hyperGrid.loopsAndConditions;

public class AboutSwitchCase {

    public static void main(String[] args) {
        String day = "Friday";
        switch (day){
            case "Monday":
                System.out.println("Test Monday");
                System.out.println("Test Monday");
                break;
            case "Tuesday":
                System.out.println("Test Tuesday");
                System.out.println("Test Tuesday");
                break;
            case "Wednesday":
                System.out.println("Test Wednesday");
                System.out.println("Test Wednesday");
                break;
            case "Thursday":
                System.out.println("Test Thursday");
                System.out.println("Test Thursday");
                break;
            default:
                System.out.println("Provide right working day");
        }
    }
}
