package com.ncu.recursive;

/**
 *  给定 一个数n，求最小的数的各个位之积为n的数m
 */
public class BitProduct {

    public int minBitProduct(int n){
        int temp = helper(n);
        if(temp<0) return -1;
        return temp;
    }

    private int helper(int m) {
        if(m<=9) return m;
        for(int i=9;i>1;i--){
            if(m%9 == 0) return helper(m/i)*10 + i;
        }
        return -1;
    }
}
