public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
        }
        node.prev = tail;
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void insert(int after, int value) {
        Node p = find(after);
        Node node = new Node(value);
        if (p == null) {
            System.out.println("doesn;t exit elem");
            return;
        }
        node.next = p.next;
        node.prev = p;
        p.next = node;
        if (node.next != null) {
            node.next.prev = node;
        }
        size++;
    }

    public void displayNodeForward() {
        Node temp = head;
        System.out.print("start -> ");
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void displayNodeBackward() {
        Node temp = tail;
        System.out.print("end");
        while (temp != null) {
            System.out.print(" -> " + temp.value);
            temp = temp.prev;
        }
        System.out.println("-> start");

    }
}
