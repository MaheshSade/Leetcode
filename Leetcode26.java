package org.leetcode;

import java.util.Arrays;
import java.util.Stack;

class Leetcode26 {
    Stack stack = new Stack<>();

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!stack.isEmpty()) {
                    if ((int) stack.peek() == nums[i]) {
                        continue;
                    } else {
                        stack.push(nums[i]);
                    }
                } else {
                    stack.push(nums[0]);
                }
            }
        }
        int k = stack.size();
        for (int i = stack.size()-1; i >= 0; i--) {
           nums[i] = (int)stack.pop();
        }
        return k;
    }
    public int removeDuplicates1(int[] nums) {
        int j = 1;
        if (nums.length == 1) {
            return 1;
        }else {
            for (int i = 1;i< nums.length;i++){
                if (nums[i] != nums[i-1]){
                    nums[j] = nums[i];
                    j++;
                }
            }


        }

        return j;
    }

    public static void main(String[] args) {
        Leetcode26 leetcode26 = new Leetcode26();
//        System.out.println(leetcode26.removeDuplicates(new int[]{1, 1, 2}));
//        System.out.println(leetcode26.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(leetcode26.removeDuplicates1(new int[]{1, 1, 2}));
        System.out.println(leetcode26.removeDuplicates1(new int[]{0,0,1,1,1,2,2,3,3,4}));

    }
}
