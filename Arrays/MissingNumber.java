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
