package com.drzhi.lintcode;

import java.util.Arrays;

/**
 * @author zyanling.
 */
public class ThreeSumClosest {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers ,int target) {
        if (numbers == null || numbers.length < 3) {
            return 0;
        }

        Arrays.sort(numbers);
        int closest = Integer.MAX_VALUE, minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length - 2; ++i) {
            for (int j = i+1, k = numbers.length-1; j < k;) {
                int sum = numbers[i] + numbers[j] + numbers[k];
                if (sum > target) {
                    --k;
                } else if (sum < target) {
                    ++j;
                } else {
                    return sum;
                }

                int diff = Math.abs(target-sum);
                if (diff < minDiff) {
                    minDiff = diff;
                    closest = sum;
                }
            }
        }
        return closest;
    }
}
