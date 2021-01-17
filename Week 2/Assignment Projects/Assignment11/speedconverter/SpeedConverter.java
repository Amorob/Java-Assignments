package com.assignment1.speedconverter;

// Assignment 1
// Name: Bagei Amoro Abdulai
// Class: Java Class A

public class SpeedConverter {

    // Question 1: Speed Converter - toMilesPerHour

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0 ){
            return -1;
        }else {
            double milesPerHour, mileToKilometers=1.609;
            long milesPerHourRoundedValue;
            milesPerHour = kilometersPerHour/mileToKilometers;
            milesPerHourRoundedValue= Math.round(milesPerHour);
            return milesPerHourRoundedValue;
        }

    }

    // Question 2: Speed Converter - printConversion

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
        }else {
            double milesPerHour, mileToKilometers=1.609;
            long milesPerHourRoundedValue;
            milesPerHour = kilometersPerHour/mileToKilometers;
            milesPerHourRoundedValue = Math.round(milesPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHourRoundedValue + " mi/h");

        }
    }
}
