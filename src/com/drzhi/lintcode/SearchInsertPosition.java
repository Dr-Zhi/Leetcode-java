package com.drzhi.lintcode;

/**
 * http://www.lintcode.com/en/problem/search-insert-position/
 *
 * @author zyanling.
 */
public class SearchInsertPosition {
    /**
     * @param A an integer sorted array
     * @param target  an integer to be inserted
     * @return an integer
     */
    public int searchInsert(int[] A, int target) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int low = 0, high = A.length-1, middle;
        while (low <= high) {
            middle = low + (high - low) / 2;
            if (A[middle] > target) {
                high = middle - 1;
            } else if (A[middle] < target) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return low;
    }
}
