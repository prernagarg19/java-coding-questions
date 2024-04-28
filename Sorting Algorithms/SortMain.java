public class SortMain {
    public static void main(String args[]) {
        int arr[] = {10, 13, 2, 5, 8, 1, 9, 3};
        BubbleSort bS = new BubbleSort();
        bS.bubbleSort(arr);
        bS.printArray(arr);
    }
}
