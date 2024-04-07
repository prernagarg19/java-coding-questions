/*
 * This function should rotate all the nodes in the list by some number passed in. For instance, if your list looks like 1 -> 2 -> 3 -> 4 -> 5 and you rotate by 2, the list should be modified to 3 -> 4 -> 5 -> 1 -> 2. The number passed in  to rotate can be any integer.
    Time Complexity : O(N), where N is the length of the list. Space Complexity : O(1)
 */

public class RotateLinkedList {
    public Node head;
    public Node tail;
    public int size;
    
    public Node rotateLinkedList(LinkedList lList,int number) {
        int length = 1;
        Node tempNode = lList.head;
        while(tempNode.next != null) {
            tempNode = tempNode.next;
            length++;
        }
        if(number%length == 0)  {
            return head;
        }
        number = number%length;
        tempNode.next = lList.head;
        Node newLastNode = findNthNode(lList.head, (length-number));
        lList.head = newLastNode.next;
        newLastNode.next = null;
        return head;
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
}
