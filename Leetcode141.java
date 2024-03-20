import java.util.HashSet;
import java.util.Set;

public class Leetcode141 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    Set<ListNode> set = new HashSet<>();
    public boolean hasCycle(ListNode head) {
        while (head!=null){
            if(set.contains(head)){
                return true;
            }else set.add(head);
            head = head.next;
        }
        return false;
    }


    public static void main(String[] args) {
        Leetcode141 leetcode141 = new Leetcode141();


    }
}
