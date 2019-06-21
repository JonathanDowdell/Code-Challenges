package com.company;

public class Main {

    private static String letterChanges(String str) {
        StringBuilder resultString = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char charValue = str.charAt(i);
            if (Character.isLetter(charValue)) {
                // Valid Alphabet
                charValue++;
                switch (charValue) {
                    case 'a': case 'e': case 'i': case 'o': case'u':
                        charValue = String.valueOf(charValue).toUpperCase().charAt(0);
                }
            } resultString.append(charValue);
        }
        return resultString.toString();
    }

    public static void main(String[] args) {
        System.out.println(letterChanges("sentence"));
    }
}
