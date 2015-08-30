package com.drzhi.lintcode;

/**
 * http://www.lintcode.com/en/problem/remove-element/
 *
 * @author zyanling.
 */
public class RemoveElement {
    /**
     *@param A: A list of integers
     *@param elem: An integer
     *@return The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int end = findLastNotElem(A, elem, A.length);
        for (int i = 0; i < end; ++i) {
            if (A[i] == elem) {
                swap(A, i, end);
                end = findLastNotElem(A, elem, end);
            }
        }
        return end+1;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    private int findLastNotElem(int[] A, int elem, int index) {
        --index;
        while (index >= 0 && A[index] == elem) {
            --index;
        }
        return index;
    }
}
