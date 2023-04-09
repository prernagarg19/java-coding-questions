import java.util.*;
/*
 * Write a program to find all pairs of integers whose sum is equal to a given number.

Examples

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1]


Input: nums = [3,2,4], target = 6
Output: [1,2]
*/
class TwoSumProblem {
	public static void main(String[] args) {
		
		TwoSumProblem tObj = new TwoSumProblem();
		int[] nums = {2,6,3,9,11};
		int target = 10;
		int[] arr = tObj.twoSum(nums, target);
		System.out.print(Arrays.toString(arr));
	}
	
	public int[] twoSum(int[] nums, int target) {
		for(int i=0; i<nums.length; i++) {  //nums.length-1--??
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]+ nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		throw new IllegalArgumentException("No solution found");
	}
}
	
//	O(n)
	/*
	 * public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target - numbers[i])) {
            result[1] = i;
            result[0] = map.get(target - numbers[i]);
            return result;
        }
        map.put(numbers[i], i);
    }
    return result;
}*/


/*
 * class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i]+ nums[j] == target) {
                    arr[0]= i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}*/
