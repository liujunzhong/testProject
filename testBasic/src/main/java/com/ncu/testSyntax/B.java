package com.ncu.testSyntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author ljz
 * @Date 2020/3/18 14:25
 * @Version 1.0
 **/
public class B{
    static boolean b;
    public static void main(String[] args) {

//        Integer i1 = 128;
//        Integer i2 = 128;
//        System.out.println(i1 == i2);


        int i1 = 1000;
        int i2 = 1000;
        System.out.println(i1 == i2);









//        System.out.println(b);
//        int[] nums = {9};
//        System.out.println(Arrays.toString(plusOne(nums)));
//        char c = 74;
//        Double d = 3000.0;
//        char cc = '\u0000';
//        System.out.println(c);

//        String s1 = "hello";
//        String s2 = "he" + "llo";
//        System.out.println(s1 == s2);

//        int[] a = {1,2,3,4};
//        int[] b = a.clone();
//
//        a[0] = 0;
//        System.out.println(b[0]);

//        int[] a = {}


    }

    public static int[] plusOne(int[] digits) {
        int res = 0;
        for(int i=0;i<digits.length;i++){
            res = res*10 + digits[i];
        }

        res += 1;
        List<Integer> list = new ArrayList<>();
        if(res <= 10) list.add(res);
        while(res >10){
            list.add(res%10);
            res = res/10;
        }
        int[] result = new int[list.size()];
        int j = 0;
        for(int i=result.length-1;i>=0;i--){
            result[i] = list.get(j++);
        }
        return result;

    }
}
