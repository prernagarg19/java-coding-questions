
/*
 * Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.
 */
public class Partition {
    public Node head;
    public Node tail;
    public int size;

    public void partitionOfLL(LinkedList ll, int x) {
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while(currentNode != null) {
            Node nextNode = currentNode.next;
            if(currentNode.value < x) {
                //insert at the beginning
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                //insert at end
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null; //last node should point to null
        return ll;
    }
}
