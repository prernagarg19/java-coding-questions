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

    /** Insertion in the Circular Singly Linked List */
    public void insertInCircularSLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createCircularSLL(nodeValue);
            return;
        }else if(location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if(location >= size) {
            tail.next = node;
            tail = node;
            node.next = head;
        } else {
            Node tempNode = head;
            int index=0;
            while(index < location-1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    /*Traversing the Circular Singly Linked List */
    public void traversingCircularSLL() {
        if(head != null) {
            Node tempNode = head;
            for(int i=0; i<size; i++) {
                System.out.print(tempNode.value);
                if(i != size-1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }else {
            System.out.print("Circular SLL doesn't exist.");
        }
    }

    /* Searching In Circular Singly Linked List */
    public boolean searchInCircularSLL(int nodeValue) {
        if(head != null) {
            Node tempNode = head;
            for(int i=0; i<size; i++) {
                if(tempNode.value == nodeValue) {
                    System.out.println(nodeValue + " found at - "+ i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println(nodeValue + " not found.");
        return false;
    }

    /* Deleting a node in Circular Singly Linked List */
    public void deleteNodeInCircularSLL(int location) {
        if(head == null) {
            System.out.println("Circular Singly LL doesn't exist.");
            return;
        }else if(location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if(size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        }else if(location >= size) {
            Node tempNode = head;
            for(int i=0; i<size-1; i++) {
                tempNode = tempNode.next;
            }
            if(tempNode == head) {
                head.next = null;
                head = null;
                size=0;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for(int i=0; i<location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    /*Deleting entire Circular Singly Linked List */
    public void deleteCircularSLL() {
        if(head == null) {
            System.out.println("Circular SLL doesn't exist.");
            return;
        }else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("Circular SLL deleted successfully!");
        }
    }
}
