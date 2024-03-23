public class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    /* CREATE DOUBLY LINKED LIST */
    public DoublyNode createDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.prev = null;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        return head;
    }
}
