package com.ncu.alogrithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        List<Integer> list = getPrintMatrix(matrix);
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static List<Integer> getPrintMatrix(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int row = matrix.length;
        int column = matrix[0].length;
        int circle = ((row < column ? row : column) - 1) / 2 + 1;

        for (int i = 0; i < circle; i++) {
            for (int j = i; j < column - i; j++) {
                list.add(matrix[i][j]);
            }
            for (int k = i + 1; k < row - i; k++) {
                list.add(matrix[k][column - i - 1]);
            }
            for (int m = column - i - 2; (m >= i) && (row - i -1 != i); m--) {
                list.add(matrix[row - i - 1][m]);
            }
            for(int n = row - i - 2;(n > i) && (column - i - 1 != i);n--){
                list.add(matrix[n][i]);
            }
        }
        Integer.bitCount(10000);
        return list;
    }


}


