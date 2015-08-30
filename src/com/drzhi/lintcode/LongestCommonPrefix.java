package com.drzhi.lintcode;

/**
 * http://www.lintcode.com/en/problem/longest-common-prefix/
 *
 * @author zyanling.
 */
public class LongestCommonPrefix {
    /**
     * @param strs: A list of strings
     * @return The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int n = strs.length;
        int pos = 0;
        while (true) {
            if (strs[0].length() == pos) {
                return strs[0];
            }

            char c = strs[0].charAt(pos);
            for (String str : strs) {
                if (str.length() == pos || str.charAt(pos) != c) {
                    return str.substring(0, pos);
                }
            }
            ++pos;
        }
    }
}
