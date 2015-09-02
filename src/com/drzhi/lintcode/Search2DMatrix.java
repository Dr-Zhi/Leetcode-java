package com.drzhi.lintcode;

/**
 * http://www.lintcode.com/en/problem/search-a-2d-matrix/
 *
 * @author zyanling.
 */
public class Search2DMatrix {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            int i = mid / n, j = mid % n;
            int value = matrix[i][j];
            if (value > target) {
                high = mid - 1;
            } else if (value < target) {
                low = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
