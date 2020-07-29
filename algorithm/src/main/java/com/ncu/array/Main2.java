package com.ncu.array;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int p = scanner.nextInt();
        System.out.println(helper(x, p));
    }
    public static int helper(int x,int p){
        long max = 10000000000000000L;
        long sum = x;
        int days = 0;
        while (sum <= max){
            sum = p*sum+1;
            days++;
            System.out.println("sum" + sum);
        }
        return days-1;
    }
}
