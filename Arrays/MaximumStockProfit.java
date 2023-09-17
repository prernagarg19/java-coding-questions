/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *  You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to 
 * sell that stock. Return the maximum profit you can achieve from this transaction.If you cannot achieve any profit,return 0.
    Example:
        Input: prices = [7, 1, 5, 3, 6, 4] 
        Output: 5 
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 */
public class MaximumStockProfit {
    public static void main(String[] args) {
        MaximumStockProfit mf = new MaximumStockProfit();
        int[] arr = {7, 1, 5, 3, 6, 4};
        int profit = mf.maxProfit(arr);
        System.out.println("Max. profit from stock - "+ profit);
    }

    public int maxProfit(int[] prices) {
        // int min = prices[0];
        // int index = 0;
        // // Finding min value from the array and note its index
        // for(int i=1; i<prices.length; i++) {
        //     if(prices[i] < min) {
        //         min = prices[i];
        //         index = i;
        //     }
        // }
        // //getting max value after index obtained
        // int max = prices[index];
        // for(int j=index+1; j<prices.length; j++) {
        //     if(prices[j] > max) {
        //         max = prices[j];
        //     }
        // }
        // System.out.println(max);
        // System.out.println(min);
        // return max-min;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
 
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
 
        return maxProfit;
    }
}

/*
 * EXPLANATION
 * In this solution, we iterate through the prices array using a for-each loop. We maintain two variables: minPrice to keep track of
 *  the lowest price encountered so far, and maxProfit to store the maximum profit achieved. As we iterate through the array,
 *  we check if the current price is less than the current minPrice. If so, we update the minPrice with the current price. 
 * If the current price is not less than minPrice, we check if the profit made by selling at the current price (i.e., price - minPrice) 
 * is greater than the current maxProfit. If so, we update the maxProfit with the new profit. Finally, we return maxProfit as 
 * the maximum profit that can be achieved from the given stock prices.
 */

/*
 * Time complexity:
public int maxProfit(int[] prices) { - No time complexity associated.
int minPrice = Integer.MAX_VALUE; - This initialization has a constant time complexity of O(1).
int maxProfit = 0; - This initialization has a constant time complexity of O(1).
for (int price : prices) { - This for loop iterates through the prices array once, which has a length of n. The time complexity inside the loop will determine the overall time complexity of the loop.
if (price < minPrice) { - This condition check inside the for loop has a constant time complexity of O(1).
minPrice = price; - This assignment operation inside the if statement has a constant time complexity of O(1).
} else if (price - minPrice > maxProfit) { - This condition check inside the for loop has a constant time complexity of O(1).
maxProfit = price - minPrice; - This subtraction and assignment operation inside the else-if statement have a constant time complexity of O(1).
} - No time complexity associated.
} - No time complexity associated.
return maxProfit; - This return statement has a constant time complexity of O(1).
} - No time complexity associated.
The for loop in line 4 is the dominant factor that determines the time complexity of this algorithm. Since the loop runs n times (where n is the length of the input array) and all the operations inside the loop have a constant time complexity of O(1), the overall time complexity of the maxProfit method is O(n).
 */