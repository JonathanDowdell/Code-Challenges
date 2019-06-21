package com.company;

public class Main {

    private static int firstFactorial(int number) {
        int factorialNumber = number;
        for (int i = number; i > 1; i--) {
            factorialNumber *= (i - 1);
            System.out.println(factorialNumber);
        }
        return factorialNumber;
    }

    public static void main(String[] args) {
	    firstFactorial(8);
    }
}


