package com.company;

public class Main {

    private static int simpleAdding(int number) {
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(simpleAdding(45));
    }
}
