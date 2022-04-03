package com.company.Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static final int SIZE = 3;
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static final char DOT_EMPTY = '*';
    public static final char MAP[][] = new char[SIZE][SIZE];
    public static final int WIN_COUNT = 3;

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (isWin(DOT_X)) {
                System.out.println("Человек победил");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            computerTurn();
            printMap();

            if (isWin(DOT_0)) {
                System.out.println("Компьютер победил");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void humanTurn() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Для хода введите координаты в формате Х У");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                System.out.println("Вы ввели некорректные данные");
            } else if (MAP[x][y] != DOT_EMPTY) {
                System.out.println("Данная клетка уже занята");
            } else {
                break;
            }

        } while (true);
        MAP[x][y] = DOT_X;
    }

    private static boolean isWin(char symbol) {
        if (checkRowsAndColumnsToWin(symbol)) {
            return true;
        } else {
            return checkDiagonalToWin(symbol);
        }
    }


    private static boolean checkRowsAndColumnsToWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int row = 0;
            int column = 0;
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == symbol) {
                    row = row + 1;
                }
                if (MAP[j][i] == symbol) {
                    column = column + 1;
                }
                if (row == WIN_COUNT || column == WIN_COUNT) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiagonalToWin(char symbol) {
        int diagonalOne = 0;
        int diagonalTwo = 0;
        for (int i = 0; i < SIZE; i++) {
            if (MAP[i][i] == symbol) {
                diagonalOne = diagonalOne + 1;
            }
            if (MAP[i][MAP.length -1 -i] == symbol) {
                diagonalTwo = diagonalTwo + 1;
            }
            if (diagonalOne == WIN_COUNT || diagonalTwo == WIN_COUNT)
                return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DOT_EMPTY) ;
                return false;
            }
        }
        return true;
    }

    private static void computerTurn() {
        int x;
        int y;
        Random random = new Random();

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (MAP[x][y] != DOT_EMPTY);
        MAP[x][y] = DOT_0;
    }

    public static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(MAP[i], DOT_EMPTY);
        }
    }

    private static void printMap() {
        printHeader();
        printBody();
    }

    private static void printHeader() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("  ");
            System.out.print(i + 1);
        }
        System.out.println();

    }

    private static void printBody() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
