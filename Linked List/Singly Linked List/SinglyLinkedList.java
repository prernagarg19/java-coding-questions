public class SinglyLinkedList {
	public Node head;
	public Node tail;
	public int size;
	
	/***** Creating a node in Singly Linked List */
	public Node createSinglyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		node.next = null;
		head = node;
		tail = node;               
		size = 1;
		return head;
	}

	/***** Inserting a node in Singly Linked List */
	public void insertInSinglyLinkedList(int nodeValue, int location) {
		Node node = new Node();
		node.value = nodeValue;
		if(head == null) {
			createSinglyLinkedList(5);
			return;
		} else if(location == 0) {			
			node.next = head;
			head = node;
		} else if (location >= size) {
			node.next = null;
			tail.next = node;
			tail = node;
		} else {
			Node tempNode = head;
			int index = 0;
			while(index < location-1) {
				tempNode = tempNode.next;
				index++;
			}
			Node nextNode = tempNode.next;
			tempNode.next = node;
			node.next = nextNode;
		}
		size++;
	}

	/** Traversing the Singly Linked list */
	public void traverseSinglyLinkedList() {
		if(head == null) {
			System.out.println("SLL doesn't exist");
		} else {
			Node tempNode = head;
			for(int i=0; i<size; i++) {
				System.out.println(tempNode.value);
				if( i != size-1) {
					System.out.println(" -> ");
				}
				tempNode = tempNode.next;
			}
		}	
		System.out.println("\n");	
	}

	/*** Searching in Singly Linked List */
	public boolean searchNode(int nodeValue) {
		if(head != null) {
			Node tempNode = head;
			for(int i=0; i<size; i++) {
				if(tempNode.value == nodeValue) {
					System.out.println("Node found at location - "+ i);
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("Node not found in SLL.");
		return false;
	}

	/**** Deletion of Node in SLL */
	public void deleteNode(int location) {
		if(head == null) {
			System.out.println("SLL doesn't exist.");
			return;
		} else if(location == 0) {
			head = head.next;
			size--;
			if(size == 0) {
				tail = null;
			}
		} else if(location >= size) {
			Node tempNode = head;
			for(int i=0; i<size-1; i++) {
				tempNode = tempNode.next;
			}
			if(tempNode == head) {			// only one node exists in SLL
				head = tail = null;
				size--;
				return;
			}
			tempNode.next = null;
			tail = tempNode;
			size--;
		} else {
			Node tempNode = head;
			for(int i=0; i<location-1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			size--;
		}
	}

	/** Deletion of Entire Singly Linked List */
	public void deleteSinglyLinkedList() {
		head = null;
		tail = null;
		System.out.println("SLL deleted successfully!");
	}
}

