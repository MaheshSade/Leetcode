import java.util.*;
import java.util.stream.Collectors;

public class Leetcode169 {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> values = map.values().stream().sorted().toList();
        int majority = values.get(values.size()-1);
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue() == majority){
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Leetcode169 leetcode169 = new Leetcode169();
        System.out.println(leetcode169.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
