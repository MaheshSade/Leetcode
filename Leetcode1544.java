package org.leetcode;

import java.util.Stack;

class Leetcode1544 {
        public String makeGood(String s) {
            char[] output =  new char[s.length()];
            int count = 0;
            for (int i=0;i<s.length();i++){
                if (i==s.length()-1){
                    output[i-count] = s.charAt(i);
                    break;
                }
                if (String.valueOf(s.charAt(i)).equalsIgnoreCase(String.valueOf(s.charAt(i+1)))){
                    if (s.charAt(i)==s.charAt(i+1)){
                        output[i-count] = s.charAt(i);
                    }
                    else {
                        count++;
                        i++;
                    }
                }
                else {
                    output[i-count] = s.charAt(i);
                }
            }
            String s1 = new String(output);
            if(s1.contains("\u0000")){
                s1 = s1.replaceAll("\\u0000","");
            }

            if (!s1.isBlank()){
            for (int i=0;i<s1.length();i++) {
                if (i == s1.length() - 1) {
                    break;
                }
                if (String.valueOf(s1.charAt(i)).equalsIgnoreCase(String.valueOf(s1.charAt(i + 1)))) {
                    if (s1.charAt(i)!=s1.charAt(i+1)) {
//                        continue;
                        s1 = makeGood(s1);
                    }
//                    else {
//                        s1 = makeGood(s1);
//                    }
                }
            }
            }

            return s1;

        }

    public String makeGood1(String s) {
        // Use stack to store the visited characters.
        Stack<Character> stack = new Stack<>();

        // Iterate over 's'.
        for (char currChar : s.toCharArray()) {
            // If the current character make a pair with the last character in the stack,
            // remove both of them. Otherwise, we the add current character to stack.
            if (!stack.isEmpty() && Math.abs(stack.lastElement() - currChar) == 32)
                stack.pop();
            else
                stack.add(currChar);
        }

        // Returns the string concatenated by all characters left in the stack.
        StringBuilder ans = new StringBuilder();
        for (char currChar : stack)
            ans.append(currChar);
        return ans.toString();
    }
    public static void main(String[] args) {
        Leetcode1544 leetcode1544 = new Leetcode1544();
//        System.out.println(leetcode1544.makeGood("MHTLuuHhUUlthmQwUWq"));
//        System.out.println(leetcode1544.makeGood("abBAcC"));
        System.out.println(leetcode1544.makeGood1("leEeetcode"));



    }
}