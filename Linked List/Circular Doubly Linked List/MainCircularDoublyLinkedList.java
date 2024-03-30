public class MainCircularDoublyLinkedList {
    public static void main(String[] args) {
        CircularDoublyLinkedList cDLL = new CircularDoublyLinkedList();
        cDLL.createCDLL(1);
        cDLL.insertNodeInCDLL(2, 0);
        cDLL.insertNodeInCDLL(3, 2);
        cDLL.insertNodeInCDLL(4, 5);
        cDLL.traverseCDLL();
        // cDLL.reverseTraversalCDLL();
        // cDLL.searchCDLL(3);
        cDLL.deleteNodeInCDLL(0);
        cDLL.traverseCDLL();
    }
}
