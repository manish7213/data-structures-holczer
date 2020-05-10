package com.manish.ds.arrays;

import java.util.Arrays;

/**
 * Construct an algorithm to check whether two words (or phrases) are anagrams or not!
 */
public class AnagramCheck {

    public static void main(String[] args) {
        String s1 = "restful";
        String s2 = "lufster";

        String s3 = "manish";
        String s4 = "anissm";
        boolean isAnagram = isAnagram(s3,s4);

        System.out.println(isAnagram);
    }

    private static boolean isAnagram(String s1, String s2) {

        boolean flag = false;
        if (s1.length() != s2.length()) {
            return  false;
        }

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        for (int i = 0; i < s1.length() ; i++ ) {

            if (s1Array[i] == s2Array[i]) {
                flag = true;
            } else {
                return false;
            }
        }

        return flag;
    }

}
