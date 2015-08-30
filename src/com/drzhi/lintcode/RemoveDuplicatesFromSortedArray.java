package com.drzhi.lintcode;

/**
 * http://www.lintcode.com/en/problem/remove-duplicates-from-sorted-array/
 *
 * @author zyanling.
 */
public class RemoveDuplicatesFromSortedArray {
    /**
     * @param nums: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; ++j) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
}
