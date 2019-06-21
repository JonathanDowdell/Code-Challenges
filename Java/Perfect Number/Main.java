package com.company;

public class Main {

    private static boolean perfectNumber(int num) {
        int total = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        return total == num;
    }

    public static void main(String[] args) {
        System.out.println(perfectNumber(12));
    }
}
