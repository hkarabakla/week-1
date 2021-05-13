package com.hkarabakla;

import java.util.Scanner;

public class MainSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the day : ");

        int numberOfTheDay = scanner.nextInt();

        System.out.println("Today is " + getDayNameOfWeek(numberOfTheDay));
    }

    public static String getDayNameOfWeek(int dayOfTheWeek) {

        String nameOfTheDay;

        switch (dayOfTheWeek) {
            case 1:
                nameOfTheDay = "Monday";
                break;
            case 2:
                nameOfTheDay = "Tuesday";
                break;
            case 3:
                nameOfTheDay = "Wednesday";
                break;
            case 4:
                nameOfTheDay = "Thursday";
                //break;
            case 5:
                nameOfTheDay = "Friday";
                break;
            case 6:
                nameOfTheDay = "Saturday";
                break;
            case 7:
                nameOfTheDay = "Sunday";
                break;
            default:
                nameOfTheDay = "Unknown";
        }

        return nameOfTheDay;
    }
}
