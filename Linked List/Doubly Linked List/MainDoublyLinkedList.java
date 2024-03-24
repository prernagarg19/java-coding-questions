public class MainDoublyLinkedList {
   public static void main(String[] args) {
    DoublyLinkedList dLL = new DoublyLinkedList();
    dLL.createDLL(1);
    dLL.insertInDoublyLinkedList(2, 0);
    dLL.insertInDoublyLinkedList(3, 1);
    dLL.insertInDoublyLinkedList(4, 7);
    dLL.traverseDLL();
    dLL.reverseTraversalOfDLL();
    dLL.deleteNodeInDLL(1);
    dLL.traverseDLL();
    dLL.deleteEntireDLL();
    dLL.traverseDLL();
   }
    
}
