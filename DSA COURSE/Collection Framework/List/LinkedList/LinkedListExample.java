import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Basic operations
        list.add("A");
        list.add("B");
        list.add(1, "C");
        list.addFirst("D");
        list.addLast("E");

        System.out.println("LinkedList: " + list); // Output: [D, A, C, B, E]

        list.remove("A");
        list.remove(2);
        list.removeFirst();
        list.removeLast();

        System.out.println("After removals: " + list); // Output: [C]

        // Queue operations
        list.offer("F");
        System.out.println("Head of the list: " + list.peek()); // Output: C
        System.out.println("Removed head: " + list.poll()); // Output: C

        // Deque operations
        list.offerFirst("G");
        list.offerLast("H");
        System.out.println("First element: " + list.peekFirst()); // Output: G
        System.out.println("Last element: " + list.peekLast()); // Output: H
    }
}

