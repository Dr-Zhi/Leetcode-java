package com.drzhi.lintcode;

/**
 * http://www.lintcode.com/en/problem/two-strings-are-anagrams/
 *
 * @author zyanling.
 */
public class AnagramStrings {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        if (s == null || t == null) {
            return s == null && t == null;
        }
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[256];
        int index;
        for (int i = 0; i < s.length(); ++i) {
            index = s.charAt(i);
            ++count[index];
        }
        for (int i = 0; i < t.length(); ++i) {
            index = t.charAt(i);
            if (count[index] == 0) {
                return false;
            }
            --count[index];
        }

        return true;
    }
}
