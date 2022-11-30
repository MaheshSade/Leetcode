package org.leetcode;

import java.util.HashSet;

class Leetcode36 {

    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hashSet1 = new HashSet<>();
        HashSet<Character> hashSet2 = new HashSet<>();
        HashSet<Character> hashSet3 = new HashSet<>();
        HashSet<Character> hashSet4 = new HashSet<>();
        HashSet<Character> hashSet5 = new HashSet<>();
        for (int row = 0;row<board.length;row++){
            for (int col = 0;col< board.length;col++){
                if (board[row][col]!='.') {
                    if (!hashSet1.contains(board[row][col])) {
                        hashSet1.add(board[row][col]);
                        if (col<=2){
                            if (!hashSet3.contains(board[row][col])){
                                hashSet3.add(board[row][col]);
                            }else {
                                hashSet1.clear();
                                hashSet2.clear();
                                hashSet3.clear();
                                hashSet4.clear();
                                hashSet5.clear();
                                return false;
                            }
                        }
                        if (col>2 && col<=5){
                            if (!hashSet4.contains(board[row][col])){
                                hashSet4.add(board[row][col]);
                            }else {
                                hashSet1.clear();
                                hashSet2.clear();
                                hashSet3.clear();
                                hashSet4.clear();
                                hashSet5.clear();
                                return false;
                            }
                        }
                        if (col>5 && col<=8){
                            if (!hashSet5.contains(board[row][col])){
                                hashSet5.add(board[row][col]);
                            }else {
                                hashSet1.clear();
                                hashSet2.clear();
                                hashSet3.clear();
                                hashSet4.clear();
                                hashSet5.clear();
                                return false;
                            }
                        }
                    }
                    else{
                        hashSet1.clear();
                        hashSet2.clear();
                        hashSet3.clear();
                        hashSet4.clear();
                        hashSet5.clear();
                        return false;
                    }
                }
                if (board[col][row]!='.') {
                    if (!hashSet2.contains(board[col][row])) {
                        hashSet2.add(board[col][row]);

                    } else {
                        hashSet1.clear();
                        hashSet2.clear();
                        hashSet3.clear();
                        hashSet4.clear();
                        hashSet5.clear();
                        return false;
                    }
                }
            }
            hashSet1.clear();
            hashSet2.clear();
            if (row==2 || row==5){
                hashSet3.clear();
                hashSet4.clear();
                hashSet5.clear();
            }
        }
        hashSet1.clear();
        hashSet2.clear();
        hashSet3.clear();
        hashSet4.clear();
        hashSet5.clear();
        return true;
    }

    public static void main(String[] args) {
        Leetcode36 leetcode36 = new Leetcode36();
        System.out.println(leetcode36.isValidSudoku(new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}));
        System.out.println(leetcode36.isValidSudoku(new char[][]{
                  {'.', '.', '.', '.', '5', '.', '.', '3', '.'}
                , {'.', '4', '.', '3', '.', '.', '.', '.', '.'}
                , {'.', '.', '.', '.', '.', '9', '.', '.', '1'}
                , {'8', '.', '.', '.', '.', '.', '.', '2', '.'}
                , {'.', '.', '2', '.', '7', '.', '.', '.', '.'}
                , {'.', '1', '5', '.', '.', '.', '.', '.', '.'}
                , {'.', '.', '.', '.', '.', '2', '.', '.', '.'}
                , {'.', '2', '.', '9', '.', '.', '.', '.', '.'}
                , {'.', '.', '4', '.', '.', '.', '.', '.', '.'}}));
    }
}