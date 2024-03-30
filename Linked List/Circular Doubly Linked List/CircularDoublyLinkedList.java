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
            newNode.next = tempNode.next;
            newNode.prev = tempNode;
            newNode.next.prev = newNode;
            tempNode.next = newNode;
        }
        size++;
    }

    /*TRAVERSING CIRCULAR DOUBLY LINKED LIST */
    public void traverseCDLL() {
        if(head != null) {
            CircularDoublyNode tempNode = head;
            for(int i=0; i<size; i++) {
                System.out.print(tempNode.value);
                if(i != size-1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The Circular Doubly LL doesn't exist!");
        }
        System.out.println("\n");
    }

    /*REVERSE TRAVERSAL OF CIRCULAR DOUBLY LINKED LIST */
    public void reverseTraversalCDLL() {
        if(head != null) {
            CircularDoublyNode tempNode = tail;
            for(int i=0; i<size; i++) {
                System.out.print(tempNode.value);
                if(i != size-1) {
                    System.out.print("<-");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("The Circular Doubly LL doesn't exist!");
        }
        System.out.println("\n");
    }

    /*SEARCHING FOR A NODE IN CIRCULAR DOUBLY LINKED LIST */
    public boolean searchCDLL(int nodeValue) {
        if(head != null) {
            CircularDoublyNode tempNode = head;
            for(int i=0; i<size; i++) {
               if(tempNode.value == nodeValue) {
                System.out.println("value found at - "+ i);
                return true;
               }
                tempNode = tempNode.next;
            }
        }
        return false;
    }
}
