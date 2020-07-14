package com.ncu.alogrithm;

public class FibMethod {


    public int getFib(int n){
        if(n<1){
            return 0;
        }else if(n == 1 || n == 2){
            return 1;
        }
        return getFib(n - 1) + getFib(n - 2);
    }

    public int getFib2(int n){
        if(n<1){
            return 0;
        }else if(n == 1 || n == 2){
            return 1;
        }
        int[] res = new int[n + 1];
        res[1] = 1;
        res[2] = 1;
        for(int i = 3;i<=n;i++){
            res[i] = res[i-1] + res[i-2];
        }
        return res[n];
    }
}
