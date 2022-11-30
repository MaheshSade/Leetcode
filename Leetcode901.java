package org.leetcode;

import java.util.*;

class Leetcode901 {
    public Leetcode901() {

    }
    List<Integer> list = new ArrayList<>();
    int count = 1;

    public int next(int price) {
        if(list.isEmpty()){
            list.add(price);
            return 1;
        }
        count = 1;

        int size = list.size();;
       if (price<list.get(size-1)){
           list.add(price);
           return 1;
       }else {
           while (size!=0 && price>=list.get(size-1)){
               count++;
               size--;
           }
           list.add(price);
       }
        return count;

    }
    public static void main(String[] args) {
        Leetcode901 leetcode901 = new Leetcode901();
        System.out.println(leetcode901.next(31));
        System.out.println(leetcode901.next(41));
        System.out.println(leetcode901.next(48));
        System.out.println(leetcode901.next(59));
        System.out.println(leetcode901.next(79));
//        System.out.println(leetcode901.next(75));
//        System.out.println(leetcode901.next(85));
        }
}