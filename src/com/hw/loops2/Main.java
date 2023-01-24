package com.hw.loops2;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int stash = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            month +=1;
            total += stash;
            System.out.println("Месяц " + month + " cумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i +=1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int birthRate = 17 * populationY / 1000;
        int deathRate = 8 * populationY / 1000;
        int cleanBirthRate = birthRate - deathRate;
        int year = 0;
        while (year < 10) {
            year += 1;
            populationY += cleanBirthRate;
            System.out.println("Год " + year + ", население составляет " + populationY);
        }
    }
}
