package com.company;

public class Main {

    // Easy Way
    private static String firstReverse(String string) {
        String resultString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            resultString += string.charAt(i);
        }
        return resultString;
    }

    // Interesting Alternative
    private static String secondReverse(String string) {
        char temp;
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < stringBuilder.length() / 2 ; i++) {
            int last = (stringBuilder.length() - 1) - i;
            temp = stringBuilder.charAt(last);
            stringBuilder.setCharAt(i,temp);
            stringBuilder.setCharAt(last,string.charAt(i));
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {

        System.out.println(firstReverse("Jonathan"));
        System.out.println(secondReverse("Jonathan"));

    }
}