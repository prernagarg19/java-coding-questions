public class MainCircularSinglyLinkedList {
    public static void main(String[] args) {
        CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();
        cSLL.createCircularSLL(5);
        System.out.println(cSLL.head.next.value);
        System.out.println(cSLL.head.next.next.value);
    }
}
