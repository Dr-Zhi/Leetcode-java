package com.drzhi.leetcode;

/**
 * https://leetcode.com/problems/reverse-bits/
 * <p/>
 * Reverse bits of a given 32 bits unsigned integer.
 * For example, given input 43261596 (represented in binary as
 * 00000010100101000001111010011100), return 964176192 (represented in binary
 * as 00111001011110000010100101000000).
 * <p/>
 * Follow up:
 * If this function is called many times, how would you optimize it?
 * <p/>
 * Related problem: Reverse Integer
 *
 * @author zyanling
 * @since 3/22/15
 */
public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; ++i) {
            res = (res << 1) ^ (n & 0x1);
            n = n >> 1;
        }
        return res;
    }
}
