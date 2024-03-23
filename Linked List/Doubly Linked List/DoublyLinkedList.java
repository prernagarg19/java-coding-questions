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

    /*Insertion in Doubly Linked List */
    public void insertInDoublyLinkedList(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if(head == null) {
            createDLL(nodeValue);
            return;
        }else if(location == 0) {
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if(location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            // for(int i=0; i<location-1; i++) {
            //     tempNode = tempNode.next;
            // }
            int index = 0;
            while(index < location-1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }
}
