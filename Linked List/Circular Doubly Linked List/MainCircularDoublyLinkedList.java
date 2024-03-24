public class MainCircularDoublyLinkedList {
    public static void main(String[] args) {
        CircularDoublyLinkedList cDLL = new CircularDoublyLinkedList();
        cDLL.createCDLL(1);
        System.out.println(cDLL.head.value);
    }
}
