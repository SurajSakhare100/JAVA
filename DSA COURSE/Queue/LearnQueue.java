import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        //learn inbuilt queue
        // Queue<Integer> que=new LinkedList<>();
        // que.add(3);
        // que.add(1);
        // que.add(32);
        // System.out.println(que);
        // que.remove();
        // que.remove();
        // System.out.println(que.peek());
        //learn inbuilt deque
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(23);
        deque.add(33);
        deque.add(43);
        deque.addFirst(34);
        deque.addLast(24);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        }
}
