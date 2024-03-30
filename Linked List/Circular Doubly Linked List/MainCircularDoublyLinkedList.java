public class MainCircularDoublyLinkedList {
    public static void main(String[] args) {
        CircularDoublyLinkedList cDLL = new CircularDoublyLinkedList();
        cDLL.createCDLL(1);
        System.out.println(cDLL.head.value);
        cDLL.insertNodeInCDLL(2,1);
        System.out.println(cDLL.head.next.value);
    }
}
