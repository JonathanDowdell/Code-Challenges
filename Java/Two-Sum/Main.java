package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {3,4,5,7,7,8};
        // int[] array = {3,3};
        int[] results = twoSums(array,14);
        System.out.println(Arrays.toString(results));
    }

    private static int[] twoSums(int[] array, int target) {
        int[] result = new int[2];

        for (int i = 0; i < array.length; i++) {

            System.out.println("Current Index : " + i + " with the value of -> " + array[i]);

            for (int j = 0; j < array.length; j++) {

                if (i != j) {
                    System.out.println("Testing: " + array[j]);
                    if (array[i] + array[j] == target) {
                        System.out.println("Found Match [" + array[i] + " + " + array[j] + "] = " + target );
                        result[0] = j;
                        result[1] = i;
                        return result;
                    }
                }


            }

            System.out.println();
        }

        return result;
    }
}
