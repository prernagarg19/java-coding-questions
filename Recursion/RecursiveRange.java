/*
 * Write a function called recursiveRange which accepts a number and 
 * adds up all the numbers from 0 to the number passed to the function.
 */

import java.util.Scanner;

class RangeRecursive {
    public int recursiveRange(int num) {
        if(num == 0)
            return 0;
        return num + recursiveRange(num-1);
       } 
}
public class RecursiveRange {
    public static void main(String[] args) {
        RangeRecursive rr = new RangeRecursive();
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = rr.recursiveRange(num);
        System.out.println("The sum is : "+ sum);
    }
}
