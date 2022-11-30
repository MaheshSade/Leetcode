package org.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Leetcode947 {
    public int removeStones(int[][] stones) {
        int j = 0;
        int k;
        int count = 0;
        int z= 0;
        if (stones.length==1){
            return 1;
        }
        Arrays.sort(stones, Comparator.comparingInt(o -> o[0]));
        Arrays.sort(stones, Comparator.comparingInt(o -> o[1]));

        for (int i=0;i<stones.length;i++){
            k= i+1;
            while (k!=stones.length) {
                z = count;
                while (j!=2) {
                    if (stones[i][j] == stones[k][j]) {
                        count++;
                        break;
                    } else {
                        j++;
                    }
                }
                if (z<count){
                    j=0;
                    break;
                }
                j=j-2;
                k++;

            }

        }
        return count;
    }
    public static void main(String[] args) {
        Leetcode947 leetcode947 = new Leetcode947();
        System.out.println(leetcode947.removeStones(new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}}));
        System.out.println(leetcode947.removeStones(new int[][]{{0,0},{0,2},{1,1},{2,0},{2,2}}));
        System.out.println(leetcode947.removeStones(new int[][]{{0,0}}));
        System.out.println(leetcode947.removeStones(new int[][]{{0,1},{1,2},{1,3},{3,3},{2,3},{0,2}}));
        System.out.println(leetcode947.removeStones(new int[][]{{1,2},{1,3},{3,3},{3,1},{2,1},{1,0}}));
        System.out.println(leetcode947.removeStones(new int[][]{{0,1},{0,2},{4,3},{2,4},{0,3},{1,1}}));
    }
}