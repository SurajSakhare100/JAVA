import java.util.ArrayDeque;

public class LearnArrayDeque{
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.offer(23);
        adq.offer(36);
        adq.offer(11);
        adq.offer(90);
        adq.offerFirst(39);
        adq.offerLast(78);
        System.out.println(adq);
        adq.poll();
        System.out.println(adq);
        adq.pollFirst();
        adq.pollLast();
        System.out.println(adq);
       System.out.println( adq.peekFirst());
       System.out.println( adq.peekLast());
       System.out.println(adq);
    }
}