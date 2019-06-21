package com.company;

public class Main {

    private static boolean SimpleSymbols(String str) {
        return str.matches("[\\WA-Za-z\\W]");
    }


    public static void main(String[] args) {
        System.out.println(SimpleSymbols("+d++f++"));
    }
}
