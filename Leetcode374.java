package org.leetcode;

class Leetcode374 {
    int num=0;
    int first = 0;
    int last = 0;
    public int guessNumber(int n) {

        if (guess(n)==0){
            return n;
        }
        last = n;
        while(guess(num)!=0){
            num = first + ((last - first)/2);
            if(guess(num)==1){
                first = num;
            }
            else if(guess(num)==-1){
                last = num;
            }
            else return num;
        }

        return num;
    }
    int pick = 2;
    private int guess(int num) {
        if(num>pick){
            return -1;
        }
        if (num< pick){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Leetcode374 leetcode374 = new Leetcode374();
        System.out.println(leetcode374.guessNumber(2));
    }
}