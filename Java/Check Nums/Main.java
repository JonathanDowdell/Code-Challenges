package com.company;

public class Main {

    public static String CheckNumValues(int num1, int num2) {
        return (num2 == num1 ? "-1" : String.valueOf(num2 > num1));
    }

    public static String CheckNums(int num1, int num2) {

        if (num2 > num1) {
            return "true";
        }

        return "-1";

    }

    public static void main(String[] args) {
        System.out.println(CheckNumValues(8,8));
    }
}
