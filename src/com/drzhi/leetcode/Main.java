package com.drzhi.leetcode;

import com.drzhi.lintcode.AnagramStrings;

public class Main {

    public static void main(String[] args) {
        // write your code here
        AnagramStrings anagramStrings = new AnagramStrings();
        boolean isAnagram = anagramStrings.anagram("ab", "ba");
        System.out.println(isAnagram);
    }
}
