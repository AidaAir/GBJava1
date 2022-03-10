package com.company.Lesson3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        //     arrayOneZero();
        //     oneToHundred();
        //     multiplyForTwo();
        //     square();
        //      System.out.println(Arrays.toString(value(3, 6)));
    }

    private static void arrayOneZero() {
        int[] first = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < first.length; i++) {
            int value = first[i];
            if (value == 0) {
                System.out.println(1);
            } else if (value == 1) {
                System.out.println(0);
            }
        }
    }

    private static void oneToHundred() {
        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            System.out.println(i + 1);
        }
    }

    private static void multiplyForTwo() {
        int[] multi = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multi.length; i++) {
            int num = multi[i];
            if (num < 6) {
                System.out.println(num * 2);
            }
        }
    }

    private static void square() {
        int[][] s = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int w = 0; w < 4; w++) {

            }
        }
    }

    private static int[] value(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }


}