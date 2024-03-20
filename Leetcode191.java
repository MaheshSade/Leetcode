public class Leetcode191 {

    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int i = 0;
        int j = s.length()-1;
        int count = 0;
        while (i < j) {
            if (s.charAt(i) == '1'){
                count++;
            }
            if (s.charAt(j) == '1'){
                count++;
            }
            i++;
            j--;
        }
        if (i == j){
            if (s.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }

    public int hammingWeight1(int n) {
        int count = 0;
        while(n != 0) {
            if((n&1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Leetcode191 leetcode191 = new Leetcode191();
        System.out.println(leetcode191.hammingWeight1(000000000000000000000000000001010));
    }
}
