package org.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Leetcode1207 {
    Set<Integer> set = new HashSet<>();
    int count = 1;
    int j = 1;
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0;i<arr.length;i++){
            while (j<arr.length && arr[i]==arr[j]){
                count++;
                j++;
            }
            i = j-1;
            j++;

            if (!set.add(count)){
                j = 1;
                set.clear();
                return false;
            }
            count = 1;

        }
        j = 1;
        set.clear();
        return true;
    }

    public static void main(String[] args) {
        Leetcode1207 leetcode1207 = new Leetcode1207();
        System.out.println(leetcode1207.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        System.out.println(leetcode1207.uniqueOccurrences(new int[]{1, 2}));
        System.out.println(leetcode1207.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));


    }
}