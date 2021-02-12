package com.GermanSumus;

import java.util.Locale;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World " + i);
        int i = 5;
        while (i > 0) {
            System.out.println("Hello World " + i);
            i--;
        }

        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (true) {
            System.out.print("Input: ");
            userInput = scanner.nextLine().toLowerCase();
            if (userInput.equals("pass"))
                    continue;
            if (userInput.equals("quit"))
                    break;
            System.out.println(userInput);
        }
/*
        Below is an example of a do while loop, only difference is that the 'do' is executed at least once
        do {
            System.out.print("Input: ");
            userInput = scanner.nextLine().toLowerCase();
            System.out.println(userInput);
        } while (!userInput.equals("quit"));
*/
        // For each loop
        String[] fruits = {"apple", "orange", "mango"};
        for (String fruit : fruits)
            System.out.println(fruit);


    }
}
