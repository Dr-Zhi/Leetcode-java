package com.drzhi.lintcode;

/**
 * http://www.lintcode.com/en/problem/strstr/
 *
 * @author zyanling.
 */
public class StrStr {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        if (source == null || target == null || source.length() < target.length()) {
            return -1;
        }

        if (source.length() == target.length()) {
            return source.equals(target) ? 0 : -1;
        }

        for (int i = 0; i < source.length() - target.length(); ++i) {
            boolean matched = true;
            for (int j = 0; j < target.length(); ++j) {
                if (source.charAt(i+j) != target.charAt(j)) {
                    matched = false;
                    break;
                }
            }
            if (matched) {
                return i;
            }
        }

        return -1;
    }
}
