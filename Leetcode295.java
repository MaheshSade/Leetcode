package org.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Leetcode295 {
    List<Integer> list = new ArrayList();

    public void addNum(int num) {
        if (list.size()>=1) {

            if (num<list.get(0)) {
                list.add(0,num);
            }else {
                list.add(num);
            }
        }else {
            list.add(num);
        }

    }

    public double findMedian() {
        if (list.isEmpty()){
            return 0;
        }
        int size = list.size();
        if (size == 1){
            return Double.parseDouble(String.valueOf(list.get(0)));
        }
        else {
            if ((size%2)==1){
                return Float.parseFloat(String.valueOf(list.get(size/2)));
            }else {
                float a = Float.parseFloat(String.valueOf(list.get(size/2)));
                float b = Float.parseFloat(String.valueOf(list.get((size/2)-1)));
                return (a+b)/2;
            }
        }
    }


    public static void main(String[] args) {
        Leetcode295 leetcode295 = new Leetcode295();
        leetcode295.addNum(6);
        System.out.println(leetcode295.findMedian());
        leetcode295.addNum(10);
        System.out.println(leetcode295.findMedian());
        leetcode295.addNum(2);
        System.out.println(leetcode295.findMedian());
        leetcode295.addNum(6);
        System.out.println(leetcode295.findMedian());
        leetcode295.addNum(5);
        System.out.println(leetcode295.findMedian());
        leetcode295.addNum(0);
        System.out.println(leetcode295.findMedian());
        leetcode295.addNum(6);
        System.out.println(leetcode295.findMedian());
        leetcode295.addNum(3);
        System.out.println(leetcode295.findMedian());
        leetcode295.addNum(1);
        System.out.println(leetcode295.findMedian());
        leetcode295.addNum(0);
        System.out.println(leetcode295.findMedian());
        leetcode295.addNum(0);
        System.out.println(leetcode295.findMedian());

    }
}