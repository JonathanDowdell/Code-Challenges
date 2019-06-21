package com.company;

import java.util.Arrays;

public class Main {

    private static String alphabetSoup(String str) {
        // convert input string to char array
        char[] tempArray = str.toLowerCase().toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }

    public static void main(String[] args) {
        System.out.println(alphabetSoup("Jonathan"));
    }
}
