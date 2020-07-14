package com.ncu.alogrithm;

public class SqrtDemo {
    public static void main(String[] args) {
//        int i = mySqrt(8);
        int i = countPrimes(10);
        System.out.println(i);
    }

    public static int countPrimes(int n) {
        int res = 2;
        for(int i=5;i<=n;i++){
            boolean flag = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                res++;
            }
        }
        return res;
    }


    public static int mySqrt(int x) {
        double temp = x/2.0;
        double res = temp*temp;
        double start = 0,end = x;
        while(Math.abs(x - res) > 0.01){
            if(res > x){
                end= start + (end - start)/2;
            }else{
                start = start + (end - start)/2;
            }
            temp = start + (end - start)/2;
            res = temp*temp;

        }
        return (int)temp;
    }
}
