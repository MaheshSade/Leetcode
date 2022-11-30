package org.leetcode;

class Leetcode7 {
    public long reverse(int x) {
        String s = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(s);
        if (x>0) {
            s = String.valueOf(stringBuilder.reverse());
            if (s.charAt(0)=='0'){
                s = s.replaceFirst("0","");
            }
        }
        if (x==0){
            return 0;
        }
        if (x<0){
            String s1 = s.replaceFirst("-","");
            StringBuilder stringBuilder1 = new StringBuilder(s1);
            stringBuilder1.append("-");
            stringBuilder1 = stringBuilder1.reverse();
            s = String.valueOf(stringBuilder1);
        }

        System.out.println(s);
        return Long.parseLong(s);
    }
    public int reverse1(int x) {
        int sign=1;
        int res=0;
        if (x < 0){
            sign = -1;
            x=-x;
        }
        while(x != 0) {
            if (res < 0 || res > (Integer.MAX_VALUE - x % 10) / 10) return 0;
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return sign * res;
    }

    public static void main(String[] args) {
        Leetcode7 leetcode7 = new Leetcode7();
        leetcode7.reverse(-456);
        leetcode7.reverse(951);
        System.out.println(leetcode7.reverse1(864));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(64/100);

    }
}