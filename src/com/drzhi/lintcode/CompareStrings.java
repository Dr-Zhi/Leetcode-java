package com.drzhi.lintcode;

/**
 * Compare two strings A and B, determine whether A contains all of the
 * characters in B. The characters in string A and B are all Upper Case letters.
 * <p>
 * Example:
 * <ol>
 * <li>For A = "ABCD", B = "ACD", return true.</li>
 * <li>For A = "ABCD", B = "AABC", return false.</li>
 * </ol>
 * Note: the characters of B in A are not necessary continuous or ordered.
 * <p>
 * <a href="http://www.lintcode.com/en/problem/compare-strings/">
 * http://www.lintcode.com/en/problem/compare-strings/
 * </a>
 *
 * @author zyanling.
 */
public class CompareStrings {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        int[] count = new int[26];
        int index;
        for (int i = 0; i < A.length(); ++i) {
            index = A.charAt(i) - 'A';
            ++count[index];
        }
        for (int i = 0; i < B.length(); ++i) {
            index = B.charAt(i) - 'A';
            if (count[index] == 0) {
                return false;
            }
            --count[index];
        }

        return true;
    }
}
