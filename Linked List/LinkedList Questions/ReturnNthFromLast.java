public class ReturnNthFromLast {
    public Node head;
    public Node tail;
    public int size;

    public Node returnNthFromLast(LinkedList ll, int n) {
        Node p1 = ll.head;
        Node p2 = ll.head;
        for(int i=0; i<n; i++) {
            if(p2 == null)
                return null;
            p2 = p2.next;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
    
}
