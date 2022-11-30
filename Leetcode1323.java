package org.leetcode;

class Leetcode1323 {
    public int maximum69Number (int num) {
        int size = String.valueOf(num).length();
        String number = String.valueOf(num);
        int output;
        int max = 0;

        for(int i = 0;i<size;i++){
            char[] digit = number.toCharArray();
            if (digit[i]=='9'){
                digit[i] = '6';

            }
            else if (digit[i] == '6'){
                digit[i] = '9';
            }

            output = Integer.parseInt(new String(digit));
            if (max<output){
                max = output;
            }
            System.out.println(output);
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        Leetcode1323 leetcode1323 = new Leetcode1323();
        leetcode1323.maximum69Number(9696);
    }
}