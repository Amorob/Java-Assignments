package com.assignment3.barkingdog;

// Assignment 3 - Barking Dog
// Name: Bagei Amoro Abdulai
// Class: Java Class A


public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay ){
        if((barking) && ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay < 24 ))){
            return true;

    }else{
        return false;

    }
    }

}
