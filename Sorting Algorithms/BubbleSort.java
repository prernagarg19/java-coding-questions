public class BubbleSort {
    
    public void bubbleSort(int arr[]) {
        int arrayLength = arr.length;
        for(int i=0; i<arrayLength-1; i++) {
            for(int j=0; j<arrayLength-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void printArray(int arr[]) {
        System.out.println("Bubble Sort : ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
