public class MainCircularSinglyLinkedList {
    public static void main(String[] args) {
        CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();
        cSLL.createCircularSLL(2);
        // System.out.println(cSLL.head.next.value);
        // System.out.println(cSLL.head.next.next.value);
        cSLL.insertInCircularSLL(1,0);
        // System.out.println(cSLL.head.next.value);
        // System.out.println(cSLL.head.next.next.value);
        cSLL.insertInCircularSLL(4,2);
        cSLL.insertInCircularSLL(3,1);   
        cSLL.traversingCircularSLL();
        cSLL.deleteNodeInCircularSLL(1);
        cSLL.traversingCircularSLL();
        cSLL.deleteCircularSLL();
    }
}
