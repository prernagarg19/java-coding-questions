public class MainSinglyLinkedList {
	public static void main(String[] args) {
		SinglyLinkedList sLL = new SinglyLinkedList();
		sLL.createSinglyLinkedList(5);
		sLL.insertInSinglyLinkedList(6, 1);
		sLL.insertInSinglyLinkedList(7, 3);
		sLL.insertInSinglyLinkedList(8, 4);
		sLL.insertInSinglyLinkedList(9, 0);
		sLL.traverseSinglyLinkedList();
		sLL.deleteNode(1);
		sLL.traverseSinglyLinkedList();
		sLL.deleteSinglyLinkedList();
		sLL.traverseSinglyLinkedList();
	}
}