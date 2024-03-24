public class CircularDoublyLinkedList {
    public CircularDoublyNode head;
    public CircularDoublyNode tail;
    public int size;

    /*CREATE CIRCULAR DOUBLY LINKED LIST */
    public CircularDoublyNode createCDLL(int nodeValue) {
        CircularDoublyNode newNode = new CircularDoublyNode();
        newNode.value = nodeValue;
        head = new CircularDoublyNode();
        head = newNode;
        tail = newNode;
        newNode.prev = newNode;
        newNode.next = newNode;
        size++;
        return head;
    }
}
