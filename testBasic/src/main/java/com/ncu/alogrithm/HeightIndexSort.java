package com.ncu.alogrithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeightIndexSort {
    public static void main(String[] args) {
        test();
    }


    public static void test(){
//        List<int[][]> list = new ArrayList<>();
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};

        Arrays.sort(people,(a,b)->a[0] == b[0]?a[1] - b[1]:b[0]-a[0]);
        for(int[] temp:people){
            System.out.println(Arrays.toString(temp));
        }


    }
}
