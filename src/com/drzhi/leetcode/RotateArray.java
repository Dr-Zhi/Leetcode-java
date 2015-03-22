package com.drzhi.leetcode;

/**
 * https://leetcode.com/problems/rotate-array/
 *
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
 * [5,6,7,1,2,3,4].
 * Note: try to come up as many solutions as you can, there are at least 3
 * different ways to solve this problem.
 * [show hint]
 * Hint: could you do it in-place with O(1) extra space?
 * Related problem: Reverse Words in a String II
 *
 * Complexity: O(n); Space: O(1).
 *
 * @author zyanling
 * @since 3/22/15
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n);
        reverse(nums, 0, k);
        reverse(nums, k, n);
    }

    private void reverse(int[] nums, int s, int e) {
        while (s < --e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            ++s;
        }
    }
}
