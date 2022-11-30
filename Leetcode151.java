package org.leetcode;

import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Leetcode151 {
    public String reverseWords(String s) {
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        StringBuilder stringBuilder = new StringBuilder();
        if (stringTokenizer.countTokens() == 1) {
            return stringTokenizer.nextToken();
        } else {
            TreeSet<String> set = new TreeSet<>();
            while (stringTokenizer.hasMoreTokens()) {
//            System.out.print(stringTokenizer.nextToken()+ " ");
                set.add(stringTokenizer.nextToken());
            }
            System.out.println(set);
            Iterator<String> i = set.iterator();
            while (i.hasNext()) {
                stringBuilder.append(i.next() + " ");
            }
        }

        return String.valueOf(stringBuilder);
    }

    public String reverseWords1(String s) {
        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }
        if (s.charAt(0) == ' ') {
            s = s.replaceFirst(" ", "");
        }
        String[] s1 = s.split(" ", -1);

        StringBuilder stringBuilder = new StringBuilder();
        if (s1.length > 1) {
            int i = s1.length;
            while (i>0){
                stringBuilder.append(s1[i-1]);
                i--;
                if (i>0){
                    stringBuilder.append(" ");
                }
            }
        } else {
            return s1[0];
        }
        String f = String.valueOf(stringBuilder);
        if(f.charAt(0)==' '){
            f = f.replaceFirst(" ", "");
        }
        return f;
    }

    public static void main(String[] args) {
        Leetcode151 leetcode151 = new Leetcode151();
        System.out.println(leetcode151.reverseWords1(" hello world"));
        System.out.println(leetcode151.reverseWords1("a good   example"));
        System.out.println("w");
    }
}