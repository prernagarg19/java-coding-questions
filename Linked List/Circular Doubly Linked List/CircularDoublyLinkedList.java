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

    /*DELETION IN CIRCULAR DOUBLY LINKED LIST */
    public void deleteNodeInCDLL(int location) {
        if(head == null) {
            System.out.println("The Circular Doubly LL doesn't exist");
            return;
        } else if(location == 0) {
            if(size == 1) {
                head.prev = null;
                head.next = null;
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        } else if(location >= size) {
            if(size == 1) {
                head.prev = null;
                head.next = null;
                head = null;
                tail = null;
                size--;
                return;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        } else {
            CircularDoublyNode tempNode = head;
            for(int i=0; i<location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    /*DELETE ENTIRE CIRCULAR DOUBLY LINKED LIST */
    public void deleteEntireCDLL() {
        CircularDoublyNode tempNode = head;
        for (int i=0; i<size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The CDLL has been deleted!");
    }
}
