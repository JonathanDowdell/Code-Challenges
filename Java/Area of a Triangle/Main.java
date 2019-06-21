package com.company;

public class Main {

    // Write a function that takes the base and height of a triangle and return its area.
    public static void main(String[] args) {
        System.out.println(areaOfTriangle(3,2));
        String hello = "Jonathan";
    }

    private static double areaOfTriangle(double base, double height) {
        return (base * height) / 2;
    }
}
