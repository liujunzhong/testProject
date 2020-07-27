package com.ncu.tree;

import java.util.Arrays;

public class Interview {
    public static void main(String[] args) {

    }

    public static int cal(int[] ints){
        Arrays.sort(ints);
        int a = 0,b=0;
        boolean c = true;
        for(int i=ints.length-1;i>0;i--){
            if(c && ints[i] == ints[i-1]){
                a = ints[i];
                c = false;
            }else if(!c && ints[i] == ints[i-1]){
                b =  ints[i];
            }
        }
        if(a == 0 || b == 0){
            return -1;
        }
        return a * b;
    }
}
