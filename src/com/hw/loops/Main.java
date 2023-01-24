package com.hw.loops;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Число " + i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Число " + i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println("Четное число " + i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Число " + i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i < 2097; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является высокосным");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int stash = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += stash;
            System.out.println("Месяц " + i + " cумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int stash = 29000;
        float total = 0f;
        for (int i = 1; i <= 12; i++) {
            /*Непонятно в какой момент должны начисляться проценты,
             поэтому строки в теле цикла можно поменять местами*/
            total = total + total / 100;
            total = total + stash;
            System.out.println("Месяц " + i + " cумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 2);
        }
    }
}