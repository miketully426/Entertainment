package org.launchcode;

import java.util.Scanner;

public class Entertainment2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the weather like today? Answer: sunny cloudy or rainy. ");
        String weather = keyboard.nextLine();
        System.out.println("What kind of mood are you in for activities? Answer: exercise party or quiet ");
        String mood = keyboard.nextLine();
        System.out.println("YO!");

    }
}
