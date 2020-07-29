package com.ncu.array;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        int[] out = new int[times];
        int[] in = new int[times];
        int i=0;
        while (i<times){
            out[i] = scanner.nextInt();
            in[i++] = scanner.nextInt();
        }
        int[] res = helper(out, in);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
    public static int[] helper(int[] out,int[] in){
        int[] res = new int[2];
        int outRes = 0;
        int max = 0;
        int sum = 0;
        for(int i=0;i<out.length;i++){
            outRes += in[i];
            outRes -= out[i];
        }
        for(int i=0;i<out.length;i++){
            sum+= in[i];
            sum-= out[i];
            if(sum > max){
                max = sum;
            }
        }
        res[0] = outRes;
        res[1] = max;
        return res;
    }
}
