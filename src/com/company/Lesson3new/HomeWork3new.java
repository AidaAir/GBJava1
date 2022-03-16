package com.company.Lesson3new;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3new {

    public static void main(String[] args) {
          arrayOneZero();
          oneToHundred();
          multiplyForTwo();
          square();
          System.out.println(Arrays.toString(value(3, 6)));
    }

    private static void arrayOneZero() {
        int[] first = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < first.length; i++) {
            if (first[i] == 0) {
                first[i] = 1;
            } else {
                first[i] = 0;
            }
        }
        System.out.println(Arrays.toString(first));
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
            if (multi[i] < 6) {
                multi[i] = multi[i] * 2;
            }
        }
        System.out.println(Arrays.toString(multi));
    }

    private static void square() {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            System.out.println(Arrays.toString(array[i]));
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

