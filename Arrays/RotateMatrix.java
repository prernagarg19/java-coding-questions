/*
 * Rotate matrix/ Rotate image by 90 degrees  (matrix should be n*n for this)
 * 
 * Solution - Step 1 -> Find Transpose of the matrix
 *            Step 2 -> Reverse each row of the transposed matrix
 */

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, {9, 10, 11, 12}, {13, 14, 15, 16} };
        //First Transpose the matrix
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                //swap for Transpose
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //Then reverse each row to get desired output
        for(int i=0; i<arr.length; i++) {
            int start=0;
            int end = arr.length -1;
            while(start < end) {
                int temp = arr[i][end];
                arr[i][end] = arr[i][start];
                arr[i][start] = temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

}


/*
 * TIME COMPLEXITY
 * Step 1 : O(N^2)
 * Step 2 : O(N * N/2)
 * Overall -> O(N^2) + O(N * N/2)
 * 
 * SPACE COMPLEXITY
 * O(1) since we are not using a separate array for operations.
 */