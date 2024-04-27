public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNodeInLL(2);
        ll.insertNodeInLL(3);
        ll.insertNodeInLL(4);
        ll.insertNodeInLL(5);
        ll.insertNodeInLL(2);
        ll.insertNodeInLL(1);
        ll.traverseLL();
        RemoveDuplicates deleteDups = new RemoveDuplicates();
        deleteDups.removeDuplicates(ll);
        ll.traverseLL();
        RotateLinkedList lList = new RotateLinkedList();
        lList.rotateLinkedList(ll, 2);
        System.out.println("After rotation : ");
        ll.traverseLL();
        lList.reverseRotateLinkedList(ll,2);
        System.out.println("After Reverse rotation : ");
        ll.traverseLL();

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.push(5);  // Success
        singlyLinkedList.push(10);  // Success
        singlyLinkedList.push(15);  // Success
        singlyLinkedList.push(20);  // Success
        singlyLinkedList.push(25);  // Success
        Node temp = singlyLinkedList.removeNode(2);
        System.out.println(temp.value);  //15
        singlyLinkedList.removeNode(100); // null
        System.out.println(singlyLinkedList.head.value);   // 5
        System.out.println(singlyLinkedList.head.next.value);  // 10
        System.out.println(singlyLinkedList.head.next.next.value);  // 20


        ReturnNthFromLast nthFromLast = new ReturnNthFromLast();
        Node temp1 = nthFromLast.returnNthFromLast(ll, 3);
        System.out.println(temp1.value);
    }
}
