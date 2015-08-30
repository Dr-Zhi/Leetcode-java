package com.drzhi.leetcode;

import com.drzhi.lintcode.ProductOfArrayExcludeItself;
import com.drzhi.lintcode.StringToInteger;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ProductOfArrayExcludeItself productOfArrayExcludeItself = new ProductOfArrayExcludeItself();
        ArrayList<Integer> integers = new ArrayList<>(1);
        integers.add(0);
        System.out.println(productOfArrayExcludeItself.productExcludeItself(integers));
    }
}
