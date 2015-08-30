package com.drzhi.lintcode;

/**
 * http://www.lintcode.com/en/problem/longest-common-substring/
 *
 * @author zyanling.
 */
public class LongestCommonSubstring {
    /**
     * @param A, B: Two string.
     * @return the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        if (A == null || B == null) {
            return 0;
        }

        int result = 0;
        int m = A.length(), n = B.length();
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                char a = A.charAt(i), b = B.charAt(j);
                if (i == 0 || j == 0) {
                    dp[i][j] = (a == b ? 1 : 0);
                } else {
                    dp[i][j] = (a == b ? dp[i-1][j-1] + 1 : 0);
                }
                result = Math.max(result, dp[i][j]);
            }
        }
        return result;
    }
}
