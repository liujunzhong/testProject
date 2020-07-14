package com.ncu.alogrithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tencent {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int i = 0;
        while(i<num){
            i++;
            int op = Integer.parseInt(sc.nextLine());
            for(int j=0;j<op;j++){
                String opStr = null;
                if(sc.hasNextLine())
                    opStr = sc.nextLine();
                if(opStr.contains("PUSH")){
                    String[] strs = opStr.split(" ");
                    int opNum = Integer.parseInt(strs[1]);
                    opStr = strs[0];
                    queue.add(opNum);
                }
                switch (opStr){
                    case "TOP":
                        Integer peekNum = queue.peek();
                        if(peekNum == null){
                            System.out.println(-1);
                        }else{
                            System.out.println(queue.peek() + "top");
                        }
                        break;
                    case "POP":
                        Integer pollNum = queue.poll();
                        if(pollNum == null){
                            System.out.println(-1 + "POP");
                        }
                        break;
                    case "SIZE":
                        System.out.println(queue.size() + "size");
                        break;
                }
            }
        }

    }
}
