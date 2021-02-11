package com.GermanSumus;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        int temp = 75;
        // Multiple statement have to be within a code block
        if (temp > 85) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } else if (temp > 60) {
            System.out.println("Good day outside");
            System.out.println("Go for a walk");
        // Single statements can be placed with out a code block
        } else
            System.out.println("It's cold outside");

        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        if (hasHighIncome)
            System.out.println("Person has high income.");
        else
            System.out.println("Person does not have high income");

        // Ternary operator
        // (Conditional) ? If True : If False;
        String classType = (income > 100_000) ? "First Class" : "Economy";
        System.out.println(classType);

        // Switch statement
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("Welcome admin");
                break;
            case "moderator":
                System.out.println("Welcome moderator");
                break;
            default:
                System.out.println("Welcome guest");
        }
        // Exercise: Print out 'Fizz' is number is divisible by 5, 'Buzz' if divisible by 3,
        // 'FizzBuzz' if divisible by both 5 and 3, same number if not divisible by either.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in number: ");
        int userInput = Integer.parseInt(scanner.nextLine());

        boolean divisibleByFive = (0 == userInput%5);
        boolean divisibleByThree = (0 == userInput%3);
        boolean divisibleByBoth = (divisibleByFive && divisibleByThree);

        if (divisibleByBoth)
            System.out.println("FizzBuzz");
        else if (divisibleByFive)
            System.out.println("Fizz");
        else if (divisibleByThree)
            System.out.println("Buzz");
        else
            System.out.println(userInput);
    }
}