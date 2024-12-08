
class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size) {
        arr = new int[size];
        topOfStack = -1;
        System.out.println("Stack created successfully!");
    }

    public boolean isEmpty() {
        if(topOfStack == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if(topOfStack == arr.length-1)
            return true;
        else
            return false;
    }

    public void push(int value) {
        if(isFull()) {
            System.out.println("Stack is full.");
            return;
        }
        arr[topOfStack+1] = value;
        topOfStack++;
        System.out.println(value + " pushed to the stack successfully.");
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            System.out.println("Item poppedout from the Stack successfully.");
            return topStack;
        }
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    public void deleteStack() {
        arr = null;
        System.out.println("Stack deleted successfully.");
    }
}

public class StackOperationUsingArrays {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.push(4);
        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());
        stack.push(10);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }    
}