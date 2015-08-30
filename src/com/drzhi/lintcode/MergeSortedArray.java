package com.drzhi.lintcode;

/**
 * http://www.lintcode.com/en/problem/merge-sorted-array/
 *
 * @author zyanling.
 */
public class MergeSortedArray {
    /**
     * @param A: sorted integer array A which has m elements,
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        if (A == null || B == null || B.length == 0 || n == 0) {
            return;
        }

        while (n > 0 && m > 0) {
            if (B[n-1] >= A[m-1]) {
                A[n+m-1] = B[n-1];
                --n;
            } else {
                A[n+m-1] = A[m-1];
                --m;
            }
        }
        if (m == 0) {
            while (n > 0) {
                A[n-1] = B[n-1];
                --n;
            }
        }
    }
}
