package com.assignment7.teennumberchecker;

// Assignment 7 - Teen Number Checker
// Name: Amoro
//Class Java Class A

public class TeenNumberChecker {

    // Question 1 - hasTeen

    public static boolean hasTeen(int num1, int num2, int num3){
    if((num1 >=13 && num1 <=19) || (num2 >=13 && num2 <=19) || (num3 >=13 && num3 <=19)){
        return true;
    }else{
        return false;
    }

    }

    // Question 2 - isTeen

public static boolean isTeen(int num){
        if(num >= 13 && num <=19){
            return true;
        }else{
            return false;
        }
}
}
