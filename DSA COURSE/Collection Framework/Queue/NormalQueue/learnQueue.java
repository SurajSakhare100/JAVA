import java.util.LinkedList;
import java.util.Queue;

public class learnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(89);
        queue.offer(78);
        queue.offer(12);
        queue.offer(17);
        queue.offer(2);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.clear();
        System.out.println(queue);
        // System.out.println(queue.element());
        System.out.println(queue.peek());
        // System.out.println(queue.remove());
        System.out.println(queue.poll());
    }
}
