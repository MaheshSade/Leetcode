import java.util.ArrayList;
import java.util.List;

public class Leetcode228 {

    List<String> list = new ArrayList<>();

    public List<String> summaryRanges(int[] nums) {
        int i = 0;
        while (i < nums.length-1) {
            int first = nums[i];
            while (i< nums.length-1 && nums[i + 1] - nums[i] == 1) {
                i++;
            }
            if (first!=nums[i]) {
                list.add(first + "->" + nums[i]);
            }else {
                list.add(String.valueOf(first));
            }
            i++;
        }
        if (i == nums.length - 1){
            list.add(String.valueOf(nums[i]));
        }
        return list;
    }

    public static void main(String[] args) {
        Leetcode228 leetcode228 = new Leetcode228();
        System.out.println(leetcode228.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }
}
