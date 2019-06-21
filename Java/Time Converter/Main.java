package com.company;

public class Main {

    private static String timeConverter(int time) {
        return ((time / 60) + ":" + (time % 60));
    }

    public static void main(String[] args) {

        System.out.println(timeConverter(43));

    }
}
