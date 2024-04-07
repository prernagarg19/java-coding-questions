public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNodeInLL(2);
        ll.insertNodeInLL(3);
        ll.insertNodeInLL(1);
        ll.insertNodeInLL(4);
        ll.insertNodeInLL(2);
        ll.traverseLL();
        RemoveDuplicates deleteDups = new RemoveDuplicates();
        deleteDups.removeDuplicates(ll);
        ll.traverseLL();
        RotateLinkedList lList = new RotateLinkedList();
        lList.rotateLinkedList(ll, 2);
        ll.traverseLL();
    }
}
