package com.drzhi.lintcode;

/**
 * http://www.lintcode.com/en/problem/first-missing-positive/
 *
 * @author zyanling.
 */
public class FirstMissingPositive {
    /**
     * @param A: an array of integers
     * @return an integer
     */
    public int firstMissingPositive(int[] A) {
        if (A == null || A.length == 0) {
            return 1;
        }

        int n = A.length;
        for (int i = 0; i < n;) {
            int value = A[i];
            if (value > 0 && value <= n && value != i+1 && value != A[value-1]) {
                swap(A, i, value-1);
            } else {
                ++i;
            }
        }
        for (int i = 0; i < A.length; ++i) {
            if (A[i] != i + 1) {
                return i+1;
            }
        }

        return A.length + 1;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
