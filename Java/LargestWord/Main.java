package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static String longestWordRegex(String sen) {
        List<String> arrayList = Arrays.asList(sen.toLowerCase().split("[^A-Za-z0-9]"));
        int i = 0;
        String text = "";
        for (String item:arrayList) {
            if (item.length() > i) {
                text = item;
                i = item.length();
            }
        }
        return text;
    }


    private static String longestWord(String sen) {

        StringBuilder longestWord = new StringBuilder("");
        ArrayList<StringBuilder> stringBuilderArrayList = new ArrayList<>();
        for (int i = 0; i < sen.length(); i++) {
            char c = sen.charAt(i);
            if (Character.isLetter(c)) {
                longestWord.append(c);
            } else {
                stringBuilderArrayList.add(longestWord);
                longestWord = new StringBuilder("");
            }
        }
        stringBuilderArrayList.add(longestWord);
        return findLargestWord(stringBuilderArrayList);
    }

    private static String findLargestWord(List<StringBuilder> arry) {
        int i = 0;
        String text = "";
        for (StringBuilder item:arry) {
            if (item.toString().length() > i) {
                text = item.toString();
                i = item.toString().length();
            }
        }
        return text;
    }


    public static void main(String[] args) {

        System.out.println(longestWord("Dowdell Jonathan"));
        System.out.println(longestWordRegex("Dowdell Jonathan"));

    }
}
