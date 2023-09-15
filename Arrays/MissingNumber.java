import java.util.*;
import java.util.stream.IntStream;   //line 1 was not sufficient to import IntStream

/*
 * Find the missing number in an integer array of 1 to 10.

	Example for 10 elements
	int intArray[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
	missingNumber(intArray); // 7
*/
class MissingNumber {
	public static void main(String[] args) {
		int intArray[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
		int sum =0;
		//since an element is missing so length+1 will give total no. of elements
        int n = intArray.length + 1;
        int expectedSumOfArray = n * (n+1)/2;
        
        IntStream stream = IntStream.of(intArray);
        int actualSumOfArray = stream.sum();
        
        System.out.println("Missing number : "+ (expectedSumOfArray - actualSumOfArray));
        
        //OR
        
        for(int i : intArray) {
        	sum += i;
        }
        System.out.println("Missing number "+ (expectedSumOfArray - sum));
	}
}


/*
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
	Example 1:
		Input: nums = [3,0,1]
		Output: 2
		Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
		2 is the missing number in the range since it does not appear in nums.

 *  int n = intArray.length;
    int expectedSumOfArray = n * (n+1)/2;
        for(int i : intArray) {
        	sum += i;
        }
        System.out.println("Missing number "+ (expectedSumOfArray - sum));
 * */


 /*
  * Time complexity explanation:

public static int findMissingNumberInArray(int[] array) {: Time complexity is O(1) as it defines the function.
int n = array.length + 1;: Time complexity is O(1) as it calculates n based on the array length.
int expectedSum = (n * (n + 1)) / 2;: Time complexity is O(1) as it calculates the expected sum using the formula.
int actualSum = 0;: Time complexity is O(1) as it initializes the actualSum variable.
for (int number : array) {: The time complexity of the loop itself is O(n) because it iterates through each element in the input array, where n is the number of elements. The loop's time complexity will be determined by the operations inside the loop.
actualSum += number;: Time complexity is O(1) as it performs a single addition operation.
}: Time complexity is O(1) as it closes the for-each loop.
return expectedSum - actualSum;: Time complexity is O(1) as it calculates the difference between the expected sum and the actual sum and returns the result.
In summary, the time complexity of the findMissingNumberInArray function is determined by the for-each loop, which has a time complexity of O(n), where n is the number of elements in the input array. Since the operations inside the loop also have a time complexity of O(1), the overall time complexity of the findMissingNumberInArray function is O(n).


  */