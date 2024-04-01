import java.util.HashSet;
// import java.util.LinkedList;

public class RemoveDuplicates {
    public void removeDuplicates(LinkedList lList) {
        HashSet<Integer> distinctValues = new HashSet<Integer>();
        Node currentNode = lList.head;
        // Node prevNode = null;
        Node prevNode = currentNode.prev;
        while (currentNode != null) {
            if(distinctValues.contains(currentNode.value)) {
                // delete node as it is duplicate value
                prevNode.next = currentNode.next;
                lList.size--;
            } else {
                distinctValues.add(currentNode.value);
                prevNode = currentNode;    //update previous node
            }
            currentNode = currentNode.next;
        }
    }
}
