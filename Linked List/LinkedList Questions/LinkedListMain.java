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
    }
}
