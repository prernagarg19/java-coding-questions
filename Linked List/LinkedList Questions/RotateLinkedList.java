/*
 * This function should rotate all the nodes in the list by some number passed in.
    Time Complexity : O(N), where N is the length of the list. Space Complexity : O(1)
 */

public class RotateLinkedList {
    public Node head;
    public Node tail;
    public int size;
    
    /* 1 -> 2 -> 3 -> 4 -> 5 and you rotate by 2 then it should be  4-> 5-> 1 -> 2 -> 3 */
    public Node rotateLinkedList(LinkedList lList,int number) {
        int length = 1;
        Node tempNode = lList.head;
        while(tempNode.next != null) {
            tempNode = tempNode.next;
            length++;
        }
        if(number%length == 0)  {
            return lList.head;
        }
        number = number%length;
        tempNode.next = lList.head;
        Node newLastNode = findNthNode(lList.head, (length-number));
        lList.head = newLastNode.next;
        newLastNode.next = null;
        return lList.head;
    }

    public Node findNthNode(Node head, int n) {
        Node current = head;
        int count=1;
        while (current != null) 
        { 
            if (count == n) 
                return current; 
            count++; 
            current = current.next; 
        } 
        return null;
    }

    /*  if your list looks like 1 -> 2 -> 3 -> 4 -> 5 and you rotate by 2, the list should be modified to 3 -> 4 -> 5 -> 1 -> 2 */
    public Node reverseRotateLinkedList(LinkedList lList, int number) {
        Node tempNode = lList.head;
        int length = 1;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
            length++;
        }
        if(number%length == 0)
            return lList.head;
        number = number%length;
        tempNode.next = lList.head;
        Node newFirstNode = findNthNode(lList.head, (length-number));
        lList.tail = newFirstNode.prev;
        lList.head = newFirstNode;
        return lList.head;
    }
}
