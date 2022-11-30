package org.leetcode;

import java.util.HashSet;

class Leetcode79 {
    public boolean exist(char[][] board, String word) {
        int pos = 0;
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;
        int i;
        int j;
        int count = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                i = row;
                j= col;
                if (word.charAt(pos) == board[row][col]) {
                    HashSet<String> set = new HashSet<>();
                    set.add(String.valueOf(row)+ col);
                    pos++;
                    while (pos < word.length()) {

                        right = col + 1;
                        left = col - 1;
                        up = row - 1;
                        down = row + 1;
                        if (right< board.length && !set.contains(String.valueOf(row)+ right) && word.charAt(pos) == board[row][right]) {
                            pos++;
                            set.add(String.valueOf(row)+ right);
                            col = right;
                        } else if (left>=0 && !set.contains(String.valueOf(row)+ left) && word.charAt(pos) == board[row][left]) {
                            pos++;
                            set.add(String.valueOf(row)+ left);
                            col = left;
                        } else if (up>=0 && !set.contains(String.valueOf(up)+ col) && word.charAt(pos) == board[up][col]) {
                            pos++;
                            set.add(String.valueOf(up)+ col);
                            row = up;
                        } else if (down<board.length && !set.contains(String.valueOf(down)+ col) && word.charAt(pos) == board[down][col]) {
                            pos++;
                            set.add(String.valueOf(down)+ col);
                            row = down;
                        }else break;
                        if (pos == word.length()) {
                            set.clear();
                            return true;
                        }

                    }
                    row = i;
                    col = j;
                    set.clear();
                }
                pos=0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Leetcode79 leetcode79 = new Leetcode79();
        System.out.println(leetcode79
                .exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "SEE"));
    }
}