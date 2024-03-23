public class MainDoublyLinkedList {
   public static void main(String[] args) {
    DoublyLinkedList dLL = new DoublyLinkedList();
    dLL.createDLL(5);
    dLL.insertInDoublyLinkedList(2, 0);
    dLL.insertInDoublyLinkedList(3, 1);
    dLL.insertInDoublyLinkedList(4, 7);
    System.out.println(dLL.head.value);
    System.out.println(dLL.head.next.value);
   }
    
}
