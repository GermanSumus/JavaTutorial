package com.GermanSumus;

public class MathOperations {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);
        int x = (int)Math.ceil(1.1F);
        int y = (int)Math.floor(1.1F);
        int z = Math.max(1,2);
        int v = Math.min(1,2);
        double e = Math.random();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(v);
        System.out.println(e);
        // Random number from 1-100 rounded to the nearest integer
        System.out.println((int)Math.round(e * 100));
    }
}
