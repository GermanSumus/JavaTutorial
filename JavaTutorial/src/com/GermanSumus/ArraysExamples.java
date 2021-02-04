package com.GermanSumus;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {
        //simple array
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers[1]);
        System.out.println(Arrays.toString(numbers));
        int [] scores = {12,32,34,45,54};
        System.out.println(scores.length);
        System.out.println(Arrays.toString(scores));
        //2d array
        int[][] sales = new int[2][3];
        sales [0][0] = 1;
        System.out.println(Arrays.deepToString(sales));
        int[][][] moreSales = new int[2][3][4];
        moreSales [0][0][0] = 1;
        System.out.println(Arrays.deepToString(moreSales));
        int [][] fastSales = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(fastSales));
    }

}
