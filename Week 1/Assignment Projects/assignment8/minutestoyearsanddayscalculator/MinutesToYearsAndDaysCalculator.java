package com.assignment8.minutestoyearsanddayscalculator;

// Assinment 8 - Minutes To Years and Days Calculator
// Name: Amoro
//Class: Java Class A

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
           long minutesInDay=1440, minutesInYear=525600;
           long days, years;
           years = minutes / minutesInYear;
           days = (minutes % minutesInYear) / (minutesInDay);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
