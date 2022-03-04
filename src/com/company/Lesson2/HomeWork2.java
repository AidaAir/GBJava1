package com.company.Lesson2;

public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println("Сумма а и b лежит в пределах от 10 до 20 (включительно)?" + within10and20(10, 11));
        positiveOrNegative(-1);
        System.out.println("Число отрицательное?" + negativeTrueFalse(-7));
        printWord("Be happy!", 7);
        System.out.println(whatYear(1800));
    }

    private static boolean within10and20(int a, int b) {
        int sum = a + b;
        return sum > 10 && sum <= 20; /*в задании написано "в пределах от 10 до 20 (включительно)"
        - я поняла что "включительно" относится только к 20, поэтому с 10 указала строгое сравнение*/
    }

    private static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    private static boolean negativeTrueFalse(int n) {
        return n < 0; // 0 здесь считаем положительным числом
    }

    private static void printWord(String word, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(word);
        }
    }

    private static boolean whatYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }

}







