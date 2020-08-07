package com.ncu.other;

public class Square {

    public static void main(String[] args) {
        System.out.println(Math.sqrt(2));
        System.out.println(square(2,0.001));
    }

    public static double square(int num,double precise){
        if(num<0) throw new RuntimeException("Illegal parameter");
        int i=0;
        for(;i<num;i++){
            if(i*i==num){
                return i;
            }
            if(i*i>num){
                break;
            }
        }
        double low = i-1,high = i;
        while (high-low>precise){
            double mid = (low + high)/2;
            double square = mid*mid;
            if(square>num){
                high = mid;
            }else{
                low = mid;
            }
        }
        return (low + high)/2;
    }
}
