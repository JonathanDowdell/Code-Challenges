package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(equalSlices(8,3,3));
    }

    private static boolean equalSlices(int totalSlices, int totalPeople, int slicesEach) {
        return (totalPeople * slicesEach) <= totalSlices;
    }
}
