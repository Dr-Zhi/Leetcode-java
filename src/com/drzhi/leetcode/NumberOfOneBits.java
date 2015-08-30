package com.drzhi.leetcode;

/**
 * https://leetcode.com/problems/number-of-1-bits/
 * <p>
 * Write a function that takes an unsigned integer and returns the number of
 * ’1' bits it has (also known as the Hamming weight).
 * For example, the 32-bit integer ’11' has binary representation
 * 00000000000000000000000000001011, so the function should return 3.
 * <p>
 * More references: http://blog.csdn.net/justpub/article/details/2292823
 * <p>
 * Time complexity: linear to the result, i.e., the number of '1' bits.
 *
 * @author zyanling
 * @since 3/22/15
 */
public class NumberOfOneBits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n &= (n - 1);
        }
        return count;
    }
}
