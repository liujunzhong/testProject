package com.ncu.array;

public class PrintMatrixSpiralOrder {
    /*
     * 转圈打印矩阵
     * row行
     * column列
     * 行长度：array.length
     * 列长度：array[i].length
     */
    public static void spiralOrderPrint(int[][] Matrix) {
        int rowLeft=0;//左上角行号
        int columnLeft=0;//左上角列号
        int rowRight=Matrix.length-1;//(右下角行号)
        int columnRight=Matrix[0].length-1;//(右下角列号)
        while (rowLeft<=rowRight && columnLeft<columnRight) {
            printEdge(Matrix,rowLeft++,columnLeft++,rowRight--,columnRight--);
        }

    }

    private static void printEdge(int[][] Matrix, int rowLeft, int columnLeft,
                                  int rowRight, int columnRight) {
        //只有一行
        if (rowLeft==rowRight) {
            for (int i = columnLeft; i <= columnRight; i++) {
                System.out.print(Matrix[rowLeft][i]);
            }
        }else if (columnLeft==columnRight) {//只有一列
            for (int j = rowLeft; j <= rowRight; j++) {
                System.out.print(Matrix[j][columnLeft]);
            }
        }
        else {//一般情况,
            int curRow=rowLeft;
            int curColumn=columnLeft;
            while (curColumn!=columnRight) {
                System.out.print(Matrix[rowLeft][curColumn]);
                curColumn++;
            }
            while (curRow!=rowRight) {
                System.out.print(Matrix[curRow][columnRight]);
                curRow++;
            }
            while (curColumn!=columnLeft) {
                System.out.print(Matrix[rowRight][curColumn]);
                curColumn--;
            }
            while (curRow!=rowLeft) {
                System.out.print(Matrix[curRow][columnLeft]);
                curRow--;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {  { 1, 2, 3, 4 },
                            { 5, 6, 7, 8 },
                            { 9, 10, 11, 12 },
                            { 13, 14, 15, 16 } };
        spiralOrderPrint(matrix);
    }
}