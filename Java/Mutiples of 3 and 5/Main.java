package com.company;

public class Main {

    private static int mutiplesof3And5(int maxNumber) {
        int sum = 0;
        for (int i = 0; i < maxNumber; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(mutiplesof3And5(1000)); // 233168
    }

}
