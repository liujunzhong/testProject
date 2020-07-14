package com.ncu.array;

import java.util.HashSet;
import java.util.Set;

public class Sudoku {
    public static void main(String[] args) {

    }

    public static boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]<'1' || board[i][j]>'9'){
                    continue;
                }
                if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
            set = new HashSet<>();
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[j][i]<'1' || board[j][i]>'9'){
                    continue;
                }
                if(set.contains(board[j][i])){
                    return false;
                }
                set.add(board[j][i]);
            }
            set = new HashSet<>();
        }

        for(int r=0;r<3;r++){
            for(int c = 0;c<3;c++){
                for(int i=r*3;i<3*(r+1);i++){
                    for(int j=c*3;j<3*(c+1);j++){
                        if(board[i][j]<'1' || board[i][j]>'9'){
                            continue;
                        }
                        if(set.contains(board[i][j])){
                            return false;
                        }
                        set.add(board[j][i]);
                    }
                }
            }
        }

        return true;
    }



}
