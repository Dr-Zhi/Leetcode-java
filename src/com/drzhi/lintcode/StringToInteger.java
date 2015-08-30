package com.drzhi.lintcode;

/**
 * @author zyanling.
 */
public class StringToInteger {
    /**
     * @param str: A string
     * @return An integer
     */
    public int atoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int value = 0, pos = 0;
        while (pos < str.length() && str.charAt(pos) <= ' ') {
            ++pos;
        }
        if (pos >= str.length()) {
            return 0;
        }

        boolean negative = str.charAt(pos) == '-';
        int limit = negative ? Integer.MIN_VALUE : -Integer.MAX_VALUE;
        int multiLimit = limit / 10;
        if (str.charAt(pos) == '-' || str.charAt(pos) == '+') {
            pos++;
        }
        for (int i = pos; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return negative ? value : -value;
            }
            int digit = c - '0';
            if (value < multiLimit) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            value = value * 10;
            if (value < limit + digit) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            value -= digit;
        }
        return negative ? value : -value;
    }
}
