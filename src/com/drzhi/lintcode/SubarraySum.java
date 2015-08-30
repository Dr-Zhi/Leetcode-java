package com.drzhi.lintcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * http://www.lintcode.com/en/problem/subarray-sum/
 *
 * @author zyanling.
 */
public class SubarraySum {
    /**
     * @param nums: A list of integers
     * @return A list of integers includes the index of the first number
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        if (nums == null) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>(2);
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            Integer index = map.get(sum);
            if (index != null) {
                result.add(index+1);
                result.add(i);
                return result;
            }
            map.put(sum, i);
        }

        return result;
    }
}
