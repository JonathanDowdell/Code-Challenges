package com.company;


import java.util.LinkedList;
import java.util.List;

public class Main {

    private static int evenFibonacciNumbers(int maxNumber) {
        int option1 = 0, option2 = 1;
        List<Integer> integerList = new LinkedList<>();
        for (int i = 1; i <= 4_000_000; ++i) {
            integerList.add(option1);
            if (option1 >= maxNumber) {
                break;
            } else {
                int sum = option1 + option2;
                option1 = option2;
                option2 = sum;
            }
        }
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 2 == 0) {
                sum += integerList.get(i);
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(evenFibonacciNumbers(4_000_000)); // 4613732
    }
}
