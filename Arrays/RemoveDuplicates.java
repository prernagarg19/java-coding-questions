/*
 * Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)

    removeDuplicates({1, 1, 2, 2, 3, 4, 5})
    Output : [1, 2, 3, 4, 5]
 */

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5};
        int[] finalArr = removeDuplicates(arr);
        System.out.println(Arrays.toString(finalArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] array = new int[arr.length];
        int index = 0;
        boolean isDuplicate = false;
     
        for(int i=0; i<arr.length; i++) {
            isDuplicate = false;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                array[index] = arr[i];
                index++;
            }
        }
        // return array;

        //It copies the specified array, truncating or padding with false (if necessary) so the copy has the specified length. 
        return Arrays.copyOf(array, index);
    }
}


/*
 * Time Complexity Explanation:

int n = array.length;: This line retrieves the length of the input array, which has a time complexity of O(1).
int[] uniqueArray = new int[n];: This line initializes a new array with the same size as the input array, which has a time complexity of O(n).
int index = 0;: This line initializes an integer variable, which has a time complexity of O(1).
for (int i = 0; i < n; i++) {: This line starts a loop that iterates through each element in the input array, which has a time complexity of O(n).
boolean isDuplicate = false;: This line initializes a boolean variable, which has a time complexity of O(1).
for (int j = i + 1; j < n; j++) {: This line starts a nested loop that iterates through all elements in the input array after the current element, which has a time complexity of O(n).
if (array[i] == array[j]) {: This line checks if the current element is equal to any of the remaining elements in the array, which has a time complexity of O(1).

isDuplicate = true;: This line sets the isDuplicate variable to true if a duplicate is found, which has a time complexity of O(1).

break;: This line exits the nested loop if a duplicate is found, which has a time complexity of O(1).
if (!isDuplicate) {: This line checks if the current element is unique, which has a time complexity of O(1).
uniqueArray[index++] = array[i];: This line adds the unique element to uniqueArray and increments the index variable, which has a time complexity of O(1).
return Arrays.copyOf(uniqueArray, index);: This line returns a new array containing the unique elements from uniqueArray using the Arrays.copyOf method with the length of index, which has a time complexity of O(n).
Therefore, the overall time complexity of the removeDuplicates function is O(n^2).
 */