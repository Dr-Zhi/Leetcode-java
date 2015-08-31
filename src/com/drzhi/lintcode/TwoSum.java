package com.drzhi.lintcode;

import java.util.HashMap;
import java.util.Map;

/**
 * http://www.lintcode.com/en/problem/2-sum/
 *
 * @author zyanling.
 */
public class TwoSum {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; ++i) {
            int diff = target - numbers[i];
            Integer index = map.get(diff);
            if (index != null) {
                int[] result = new int[2];
                result[0] = index + 1;
                result[1] = i + 1;
                return result;
            }
            map.put(numbers[i], i);
        }

        return null;
    }
}
