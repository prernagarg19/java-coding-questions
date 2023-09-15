/**
 * Given an array, write a function to get first, second best scores from the array and return it in new array.
    Array may contain duplicates.

    myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
    firstSecond(myArray) // {90, 87}
 */

import java.util.Arrays;

public class TopTwoScores {
    public static void main(String[] args) {
        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[] topScoreArray = findTopTwoScores(myArray);
        System.out.println(Arrays.toString(topScoreArray));
    }

    public static int[] findTopTwoScores(int[] array){
      int firstBest = Integer.MIN_VALUE;
      int secondBest = Integer.MIN_VALUE;
      int[] arr = new int[2];
      for(int x : array) {
        int current = x;
        if(firstBest < current) {
            secondBest = firstBest;
            firstBest = current;
        } else if (secondBest < current && current < firstBest) {
            secondBest = current;
        }
        // else if(secondBest < current) {
        //     secondBest = current;
        // }
      }
        arr[0] = firstBest;
        arr[1] = secondBest;
        return arr;
    }
}


/*
Time complexity explanation:

public static int[] findTopTwoScores(int[] array) {: Time complexity is O(1) as it defines the function.

int firstHighest = Integer.MIN_VALUE;: Time complexity is O(1) as it initializes the firstHighest variable.

int secondHighest = Integer.MIN_VALUE;: Time complexity is O(1) as it initializes the secondHighest variable.

for (int score : array) {: The time complexity of the loop itself is O(n) because it iterates through each element in the input array, where n is the number of elements. The loop's time complexity will be determined by the operations inside the loop.

if (score > firstHighest) {: Time complexity is O(1) as it performs a single comparison.

secondHighest = firstHighest;: Time complexity is O(1) as it performs a single assignment operation.

firstHighest = score;: Time complexity is O(1) as it performs a single assignment operation.

} else if (score > secondHighest && score < firstHighest) {: Time complexity is O(1) as it performs up to two comparisons.

secondHighest = score;: Time complexity is O(1) as it performs a single assignment operation.

}: Time complexity is O(1) as it closes the if-else statement.

}: Time complexity is O(1) as it closes the for-each loop.

return new int[]{firstHighest, secondHighest};: Time complexity is O(1) as it returns an integer array containing two elements.

In summary, the time complexity of the findTopTwoScores function is determined by the for-each loop, which has a time complexity of O(n), where n is the number of elements in the input array. Since the operations inside the loop also have a time complexity of O(1), the overall time complexity of the findTopTwoScores function is O(n).
 */ 