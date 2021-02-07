package com.GermanSumus;

public class Casting {
    public static void main(String[] args) {
        // Implicit casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        double X = 1.1;
        double Y = X + 2; //2.0
        System.out.println(Y);
        // Explicit casting
        double Xx = 1.1;
        int Yy = (int)Xx + 2;
        System.out.println(Yy);
        String xy = "1";
        int yx = Integer.parseInt(xy) + 2;
        System.out.println(yx);
        String XY = "1.1";
        double YX = Double.parseDouble(XY);
        System.out.println(YX);

    }
}
