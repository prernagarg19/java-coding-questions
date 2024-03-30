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

    /*INSERTION IN CIRCULAR DOUBLY LINKED LIST */
    public void insertNodeInCDLL(int nodeValue, int location) {
        CircularDoublyNode newNode = new CircularDoublyNode();
        newNode.value = nodeValue;
        if(head == null) {
            createCDLL(nodeValue);
            return;
        } else if(location == 0) {
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            tail.next = newNode;
        } else if(location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            CircularDoublyNode tempNode = head;
            int idx = 0;
            while(idx <= location-1) {
                tempNode = tempNode.next;
                idx++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }
}
