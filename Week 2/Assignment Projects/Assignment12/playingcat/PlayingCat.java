package com.assignment10.playingcat;

// Assignment 10 - Playing Cat
// Name: Amoro

public class PlayingCat {
    public static boolean isCatPlaying (boolean summer, int temperature){
        if((temperature > 24) && (temperature < 36)){
            return true;
        } else if((summer) && (temperature > 24) && (temperature < 46)){
            return true;
        } else
        return false;
    }
}
