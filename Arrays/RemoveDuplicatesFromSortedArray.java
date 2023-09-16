/*
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and 
 * returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array 
 * in-place with O(1) extra memory.
    Example:
    Input: nums = [1, 1, 2] 
    Output: 2   -> [1,2] has length 2
 */

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray rd = new RemoveDuplicatesFromSortedArray();
        int[] arr = {1, 1, 2};
        int n = rd.removeDuplicates(arr);
        System.out.println(n);
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

        // for(int i=0; i<nums.length; i++) {
        //     for(int j=i+1; j<nums.length; j++) {
        //         if(nums[i] == nums[j]) {
        //             nums = Arrays.copyOfRange(nums, i+1, nums.length);
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(nums));
        // return nums.length;
    }
}


/*
 * Explanation:

public int removeDuplicates(int[] nums) {
Defines the removeDuplicates method that takes an input array called nums and returns an integer value representing the new length of the array after removing duplicates.
if (nums.length == 0) {
Checks if the input array is empty (length is 0).
return 0;
If it's empty, the method returns 0, indicating that there are no elements in the array.
}
Closes the if block.
int i = 0;
Initializes a pointer i to 0, which will keep track of the last non-duplicate element found in the array.
for (int j = 1; j < nums.length; j++) {
Initializes a for loop with another pointer j, starting from 1, and iterates until the end of the array. The purpose of j is to iterate through the array and compare elements with the element pointed to by i.
if (nums[j] != nums[i]) {
Checks if the element at index j is not equal to the element at index i. If the elements are not equal, it means that the element at j is a unique (non-duplicate) element.
i++;
If the elements at i and j are not equal, we increment i by 1. This prepares the next position to store the unique element.
nums[i] = nums[j];
This line updates the element at index i with the element at index j. This operation effectively moves the unique element to its correct position in the updated array, removing any duplicates encountered so far.
}
Closes the if statement.
}
Closes the for loop.
return i + 1;
Returns the new length of the array after removing duplicates. Since the pointer i is zero-based, we return i + 1 to get the correct length.
}
Closes the removeDuplicates method.



Time complexity Explanation:

public int removeDuplicates(int[] nums) { - No time complexity associated.
if (nums.length == 0) { - This condition check has a constant time complexity of O(1).
return 0; - No time complexity associated.
} - No time complexity associated.
int i = 0; - This initialization has a constant time complexity of O(1).

for (int j = 1; j < nums.length; j++) { - This for loop runs (n - 1) times, where n is the length of the input array. The time complexity inside the loop will determine the overall time complexity of the loop.
if (nums[j] != nums[i]) { - This condition check inside the for loop has a constant time complexity of O(1).
i++; - This increment operation inside the if statement has a constant time complexity of O(1).
nums[i] = nums[j]; - This assignment operation inside the if statement has a constant time complexity of O(1).
} - No time complexity associated.
} - No time complexity associated.
return i + 1; - This addition operation and return statement have a constant time complexity of O(1).
} - No time complexity associated.

The for loop in line 7 is the dominant factor that determines the time complexity of this algorithm. Since the loop runs (n - 1) times and all the operations inside the loop have a constant time complexity of O(1), the overall time complexity of the removeDuplicates method is O(n), where n is the length of the input array.
 */