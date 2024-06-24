import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class learnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        // if we want priority as max element
        // Queue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());
        queue.offer(12);
        queue.offer(78);
        queue.offer(56);
        queue.offer(23);
        queue.offer(2);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
