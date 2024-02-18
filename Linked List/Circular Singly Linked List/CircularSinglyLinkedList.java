public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    /** Creating Circular Singly Linked List */
    public Node createCircularSLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size=1;
        return head;
    }
}
