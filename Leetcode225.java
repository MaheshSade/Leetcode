import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode225 {

    Deque<Integer> queue = new ArrayDeque<>();
    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        return queue.pollLast();
    }

    public int top() {
        return queue.getLast();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        Leetcode225 leetcode225 = new Leetcode225();
        leetcode225.push(4);
        leetcode225.push(6);
//        System.out.println(leetcode225.pop());
        System.out.println(leetcode225.top());
    }
}
