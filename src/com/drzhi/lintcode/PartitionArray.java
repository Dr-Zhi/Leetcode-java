package com.drzhi.lintcode;

import java.util.Arrays;

/**
 * http://www.lintcode.com/en/problem/partition-array/
 *
 * @author zyanling.
 */
public class PartitionArray {
    /**
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0, j = nums.length-1;
        while ( i <= j) {
            if (nums[i] < k) {
                ++i;
            } else if (nums[j] >= k) {
                --j;
            } else {
                swap(nums, i, j);
            }
        }
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
