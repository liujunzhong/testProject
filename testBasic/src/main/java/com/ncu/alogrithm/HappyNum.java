package com.ncu.alogrithm;

import java.util.ArrayList;
import java.util.List;

public class HappyNum {
    public static void main(String[] args) {
//        isHappy(2);
//        long temp = 1;
//        for(int i=1;i<=30;i++){
//            temp *= i;
//        }
//
//        System.out.println(temp);

        int i = Integer.parseInt("100", 2);
        System.out.println(i);


//        Math.log(3);
    }

    public static boolean isHappy(int n) {
        if(n == 1) return true;
        List<Integer> list = new ArrayList<>();
        while(n>=10){
            int temp = n % 10;
            list.add(temp);
            n = n / 10;
        }

        list.add(n);
        int sum  = 0;
        for(int i=0;i<list.size();i++){
            sum += (int)Math.pow(list.get(i),2);
        }
        return isHappy(sum);
    }
}
