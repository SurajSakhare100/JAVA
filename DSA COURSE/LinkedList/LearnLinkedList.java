public class LearnLinkedList {
    public static void main(String[] args) {
        // LL list=new LL();
        // // list.insertFirst(100);
        // // list.insertFirst(200);
        // // list.insertFirst(300);
        // list.insertLast(3);
        // list.insertLast(5);
        // list.insertLast(7);
        // list.insertLast(8);
        // // list.insertAtIndex(9, 1);
        // // list.displayNode();
        // // System.out.println(list.deleteFirstindex());
        // // System.out.println(list.deleteLastindex());
        // // System.out.println(list.deleteAtIndex(2));
        
        // list.displayNode();
        DLL dlist=new DLL();
        dlist.insertFirst(14);
        dlist.insertFirst(15);
        dlist.insertFirst(35);
        dlist.insertLast(39);
        dlist.insertLast(90);
        dlist.insertFirst(19);
        dlist.insert(15,123);
        dlist.displayNodeForward();
        // dlist.displayNodeBackward();

    }
}

