package com.drzhi.lintcode;

import java.util.ArrayList;

/**
 * http://www.lintcode.com/en/problem/product-of-array-exclude-itself/
 *
 * @author zyanling.
 */
public class ProductOfArrayExcludeItself {
    /**
     * @param A: Given an integers array A
     * @return A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        if (A == null || A.isEmpty()) {
            return null;
        }

        int n = A.size();
        long[] leftPartialProduct = new long[n], rightPartialProduct = new long[n];
        long product = 1;
        for (int i = 0; i < n; ++i) {
            leftPartialProduct[i] = product;
            product *= A.get(i);
        }
        product = 1;
        for (int i = n - 1; i >= 0; --i) {
            rightPartialProduct[i] = product;
            product *= A.get(i);
        }

        ArrayList<Long> result = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) {
            result.add(leftPartialProduct[i] * rightPartialProduct[i]);
        }
        return result;
    }
}
