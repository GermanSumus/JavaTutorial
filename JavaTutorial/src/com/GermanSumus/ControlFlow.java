package com.GermanSumus;

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
    }
}