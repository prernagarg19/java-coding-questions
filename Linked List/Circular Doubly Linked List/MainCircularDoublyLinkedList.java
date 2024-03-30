public class MainCircularDoublyLinkedList {
    public static void main(String[] args) {
        CircularDoublyLinkedList cDLL = new CircularDoublyLinkedList();
        cDLL.createCDLL(1);
        cDLL.insertNodeInCDLL(3,0);
        cDLL.insertNodeInCDLL(2,1);
        cDLL.traverseCDLL();
        cDLL.reverseTraversalCDLL();
        cDLL.searchCDLL(3);
    }
}
