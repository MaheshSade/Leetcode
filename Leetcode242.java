import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i), 0)+1);
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i), 0)+1);
        }
        return map1.equals(map2);
    }

    public boolean isAnagram1(String s, String t) {
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for (char c : s.toCharArray()) {
            c1[c - 97]++;
        }
        for (char c : t.toCharArray()) {
            c2[c - 97]++;
        }
        for(int i = 0; i < 26; i++) {
            if (c1[i] != c2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode242 leetcode242 = new Leetcode242();
        System.out.println(leetcode242.isAnagram1("anagram","nagaram"));
        System.out.println(leetcode242.isAnagram1("rat","car"));
    }
}
