package org.launchcode;

import java.util.Scanner;

public class Entertainment {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the weather like today? Answer: sunny cloudy or rainy. ");
        String weather = keyboard.nextLine();
        System.out.println("What kind of mood are you in for activities? Answer: exercise party or quiet ");
        String mood = keyboard.nextLine();

        if(weather.toLowerCase().equals("sunny")){
            if(mood.equals("exercise")){
                System.out.println("For exercise on a sunny day, try a brisk walk in a nature preserve.");
            } else if(mood.equals("party")){
                System.out.println("For a fun party on a sunny day, look for a street festival.");
            } else if(mood.equals("quiet")){
                System.out.println("A sunny day is a beautify time to sit under a tree and read a book.");
            } else {
                System.out.println("Error: your mood answer wasn't one of the valid options");
            }
        } else if(weather.equals("cloudy")){
            if(mood.equals("exercise")){
                System.out.println("For exercise on a cloud day, the botanical gardens are a lovely walk.");
            } else if(mood.equals("party")){
                System.out.println("For a fun party on a cloudy day, ride the paddle boats at the park.");
            } else if(mood.equals("quiet")){
                System.out.println("On a cloudy day, take a camera or paints to sketch the flowers at the lakeside.");
            } else {
                System.out.println("Error: your mood answer wasn't one of the valid options");
            }
        } else if(weather.equals("rainy")){
            if(mood.equals("exercise")){
                System.out.println("Giant indoor trampolines are a fun place to exercise on a rainy day.");
            } else if(mood.equals("party")){
                System.out.println("See if your friends are playing board games to pass a rainy day.");
            } else if(mood.equals("quiet")){
                System.out.println("A rainy day is a peaceful time to journal and daydream.");
            } else {
                System.out.println("Error: your mood answer wasn't one of the valid options");
            }
        } else {
            System.out.println("Error: Your weather answer wasn't one of the valid options.");
        }
    }
}
