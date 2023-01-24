package com.hw.loops2;

public class Main {
    public static void main(String[] args) {
        task1();
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
}
