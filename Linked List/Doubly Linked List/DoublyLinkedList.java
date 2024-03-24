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

    /* TRAVERSAL OF DOUBLY LINKED LIST */
    public void traverseDLL() {
        if(head != null) {
            DoublyNode tempNode = head;
            for(int i=0; i<=size; i++) {
                System.out.print(tempNode.value);
                if(i != size) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The DLL doesn't exists!");
        }
        System.out.println("\n");
    }

    /*REVERSE TRAVERSAL OF DOUBLY LINKED LIST */
    public void reverseTraversalOfDLL() {
        if(head != null) {
            DoublyNode tempNode = tail;
            for(int i=0; i<=size; i++) {
                System.out.print(tempNode.value);
                if(i != size) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }

        } else {
            System.out.println("The DLL doesn't exist!");
        }
        System.out.println("\n");
    }

    /*SEARCHING FOR A NODE IN DOUBLY LINKED LIST */
    public boolean searchNodeInDLL(int nodeValue) {
        if(head != null) {
            DoublyNode tempNode = head;
            for(int i=0; i<size; i++) {
                if(tempNode.value == nodeValue) {
                    System.out.println("Node found at - "+ i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found in DLL.");
        return false;
    }

    /*DELETING NODE IN DOUBLY LINKED LIST */
    public void deleteNodeInDLL(int location) {
        if(head == null) {
            System.out.println("The DLL doesn't exist");
            return;
        }else if(location == 0) {
            if(size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = null;
            }
        }else if(location >= size) {
            if(size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
               tail = tail.prev;
               tail.next = null;
            }
        } else {
            DoublyNode tempNode = head;
            for(int i=0; i<location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
        }
        size--;
    }

    /*DELETING ENTIRE DOUBLY LINKED LIST */
    public void deleteEntireDLL() {
        if(head == null) {
            System.out.println("The DLL doesn't exist");
            return;
        } else {
            DoublyNode tempNode = head;
            for(int i=0; i<size; i++) {
                tempNode.prev = null;
                tempNode = tempNode.next;
            }
            head = null;
            tail = null;
            System.out.println("The DLL deleted successfully!");
        }
    }
}
