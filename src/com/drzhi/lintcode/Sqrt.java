package com.drzhi.lintcode;

/**
 * http://www.lintcode.com/en/problem/sqrtx/
 *
 * @author zyanling.
 */
public class Sqrt {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int left = 1, right = x;
        while (left <= right) {
            int middle = left + (right-left) / 2;
            int res = x / middle;
            if (middle > res) {
                right = middle - 1;
            } else if (middle < res) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return right;
    }
}
