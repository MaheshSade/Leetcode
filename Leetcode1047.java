package org.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Leetcode1047 {
    public String removeDuplicates(String s) {
        if (s.length()==1){
            return s;
        }
        Stack stack = new Stack<>();

        for (int i= 0;i<s.length();i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if ((char)stack.peek()==s.charAt(i)){
                    stack.pop();
                }
                else {
                    stack.push(s.charAt(i));
                }
            }

        }
        StringBuilder s1 = new StringBuilder();
//        while (!stack.isEmpty()) {
//            s1.append(stack.pop());
//        }
//        s1 = s1.reverse();
        for (Object c : stack){
            s1.append(c);
        }
        return String.valueOf(s1);
    }

    public static void main(String[] args) {
        Leetcode1047 leetcode1047 = new Leetcode1047();
        System.out.println(leetcode1047.removeDuplicates("a"));
        System.out.println(leetcode1047.removeDuplicates("azxxzy"));
    }
}