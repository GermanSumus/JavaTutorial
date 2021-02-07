package com.GermanSumus;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        /*
         When using nextFoo(), for the exception of nextLine(), the new line "\ln" at the end is read on
         the next scan of user input. Example nextByte(): "32\ln" user types in "32'Enter'" followed by
         another nextFoo(). nextFoo() is "skipped" because it reads in "\ln" left over from the previous
         scan. Work around for the issue is to read in the line and convert to needed type. Exception handling
         required to prevent string to be parsed to int etc.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        byte age = Byte.parseByte(scanner.nextLine());
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + age);
        System.out.println("Your name is " + name);
    }
}
