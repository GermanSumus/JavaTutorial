package com.GermanSumus;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);
        NumberFormat percentage = NumberFormat.getPercentInstance();
        String percentResult = percentage.format(.50);
        System.out.println(percentResult);
        // Method chaining for single instance
        String balance = NumberFormat.getCurrencyInstance().format(234567.89);
        System.out.println(balance);
    }
}
