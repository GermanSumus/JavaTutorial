package com.GermanSumus;

import java.awt.*;
import java.util.Date;

public class JavaTypes {
    public static void main(String[] args) {
        //Primitive data types
        int myAge = 45;
        int herAge = myAge;
        myAge = 50;
        System.out.println(myAge);
        System.out.println(herAge);
        /* Memory range per data type.
         * byte [8bit] short [16bit] int [32bit] long [64bit]
         * float [32bit] double [64bit] char [16bit] boolean [8bits] */
        byte age = 24;
        short biggerNumber = 15_000;
        int viewCount = 123_456_789;
        long population = 7_000_000_000L;
        double unixTime = 1_612_327_425.543_514;
        float price = 10.99F;
        char initial = 'G';
        boolean eligible = true;
        //Reference types
        Date now = new Date();
        System.out.println(now.getTime());
        Point point = new Point(1,1);
        Point point1 = point;
        point.x =2;
        System.out.println(point1);        String message = new String("Hello World!");
        String shortMsg = "Hello World Again!";
        System.out.println(message.toUpperCase() + " Hello World! ".toLowerCase() + shortMsg.length());
    }
}
