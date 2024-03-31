public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createLL(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        // node.prev = null;
        head = node;
        tail = node;
        size =1;
    }

    public void insertNodeInLL(int nodeValue) {     //we aare inserting at the end of linked list
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traverseLL() {
        if(head != null) {
            Node tempNode = head;
            for(int i=0; i<size; i++) {
                System.out.print(tempNode.value);
                if(i != size-1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }else {
            System.out.println("LL doesn't exist!");
        }
        System.out.println("\n");
    }
}
