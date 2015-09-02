package com.drzhi.lintcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * http://www.lintcode.com/en/problem/3-sum/
 *
 * @author zyanling.
 */
public class ThreeSum {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        if (numbers == null || numbers.length < 3) {
            return null;
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 2; ++i) {
            if (i > 0 && numbers[i] == numbers[i-1]) {
                continue;
            }

            findAndAddZeroSumTriplet(numbers, i+1, numbers[i], result);
        }
        return result;
    }

    private void findAndAddZeroSumTriplet(int[] numbers, int start, int firstValue, ArrayList<ArrayList<Integer>> tripples) {
        for (int i = start, j = numbers.length-1; i < j;) {
            if (i > start && numbers[i] == numbers[i-1]) {
                ++i;
                continue;
            } else if (j < numbers.length - 1 && numbers[j] == numbers[j+1]) {
                --j;
                continue;
            }

            int sum = numbers[i] + numbers[j] + firstValue;
            if (sum > 0) {
                --j;
            } else if (sum < 0) {
                ++i;
            } else {
                ArrayList<Integer> tripple = new ArrayList<>(3);
                tripple.add(firstValue);
                tripple.add(numbers[i]);
                tripple.add(numbers[j]);
                tripples.add(tripple);
                ++i;
                --j;
            }
        }
    }
}
