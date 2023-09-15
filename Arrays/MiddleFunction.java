/**
 * Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

myArray = [1, 2, 3, 4]
middle(myArray)  # [2,3]

 */

import java.util.*;

class MiddleFunction {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[] arr = middle(array);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0]; // Return an empty array if the input array has 2 or fewer elements
        }
 
        // Create a new array with a size of the input array length minus 2
        int[] middleArray = new int[array.length - 2];
 
        // Copy the elements from the input array, excluding the first and last elements
        int index = 1;
        while (index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }

        // for(int i=1; i<array.length-1; i++) {
        //     middleArray[i-1] = array[i];
        // }
 
        return middleArray;
    }
}



/**
 * Time complexity explanation

In the provided middle function, the time complexity is determined by the loop that iterates through the elements of the input array.



public static int[] middle(int[] array) {: Time complexity is O(1) as it defines the function.

if (array.length <= 2) {: Time complexity is O(1) as it performs a single comparison.

return new int[0];: Time complexity is O(1) as it returns an empty array.

int[] middleArray = new int[array.length - 2];: Time complexity is O(1) as it allocates memory for the new array.

int index = 1;: Time complexity is O(1) as it initializes the index variable.

while (index < array.length - 1) {: The time complexity of the loop itself is O(n-2) because it iterates from index 1 to index array.length - 2 of the input array. However, the loop's time complexity will be dominated by the operations inside the loop.

middleArray[index - 1] = array[index];: Time complexity is O(1) as it performs a single assignment operation.

index++;: Time complexity is O(1) as it increments the index variable by 1.

return middleArray;: Time complexity is O(1) as it returns the middleArray.

In summary, the time complexity of the middle function is determined by the loop, which has a time complexity of O(n-2). Since we're looking at the overall time complexity and we usually ignore constants, the time complexity of the middle function can be considered O(n), where n is the length of the input array.
 */




