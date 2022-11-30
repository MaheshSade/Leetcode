package org.leetcode;

class Leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0;i< nums.length;i++){
            for (int j=i+1;j< nums.length;j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Leetcode1 leetcode1 = new Leetcode1();
        leetcode1.twoSum(new int[]{5, 9, 6, 2},11);
        leetcode1.twoSum(new int[]{7, 9, 2},9);

    }
}