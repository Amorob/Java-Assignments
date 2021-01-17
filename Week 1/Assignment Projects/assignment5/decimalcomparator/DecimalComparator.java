package com.assignment5.decimalcomparator;

// Assignment 5 - Decimal Comparator
// Name: Bagei Amoro Abdulai
// Class: Java Class A

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        double num3 = num1 - num2;
        if(Math.abs(num3) <= 0.0009){
            return true;
        } else {
            return false;
        }
    }

}
