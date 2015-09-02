package com.drzhi.lintcode;

/**
 * http://www.lintcode.com/en/problem/binary-search/
 * 
 * @author zyanling.
 */
public class BinarySearch {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int low = 0, high = nums.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low < nums.length && nums[low] == target ? low : -1;
    }
}
