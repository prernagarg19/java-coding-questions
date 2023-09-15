/**
 * Given 2D array calculate the sum of diagonal elements.

    myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
 
    sumDiagonalElements(myArray2D) # 15
 */

class SumOfDiagonalElements {
    public static void main(String[] args) {
        int array[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 } };
        int sum = sumDiagonalElements(array);
        System.out.println("The sum of diagonal elements of 2D array is - "+ sum);
    }
    public static int sumDiagonalElements(int[][] array) {
        // int sum=0;
        //   for(int i=0; i<array.length; i++) {
        //       for(int j=0; j<array[i].length; j++) {
        //           if(i == j) {
        //               sum += array[i][j];
        //           }
        //       }
        //   }
        // return sum;

        int sum = 0;
        int numRows = array.length;
        for (int i = 0; i < numRows; i++) {
            sum += array[i][i];
        }
        return sum;
    }
}


/*
 * Time Complexity Explanation:

public static int sumDiagonalElements(int[][] array) {: Time complexity is O(1) as it defines the function.

int sum = 0;: Time complexity is O(1) as it initializes the sum variable.

int numRows = array.length;: Time complexity is O(1) as it assigns the number of rows in the input 2D array to the numRows variable.

for (int i = 0; i < numRows; i++) {: The time complexity of the loop itself is O(n) because it iterates through each row of the input 2D array, where n is the number of rows. The loop's time complexity will be determined by the operations inside the loop.

sum += array[i][i];: Time complexity is O(1) as it performs a single addition and assignment operation.

return sum;: Time complexity is O(1) as it returns the sum variable.

In summary, the time complexity of the sumDiagonalElements function is determined by the for loop, which has a time complexity of O(n), where n is the number of rows in the input 2D array. Since the operations inside the loop also have a time complexity of O(1), the overall time complexity of the sumDiagonalElements function is O(n).
 */