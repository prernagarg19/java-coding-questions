// number that is equal to the sum of its own digits each raised to the power of the number of digits.

import java.util.Scanner;

public class CheckArmstrongNumber {

    //Time Complexity: O(log10N + 1)  and Space -> O(1)
    public static boolean checkArmstrongNumber(int number) {
        int actualNumber = number;
        int sum = 0;
        int len = String.valueOf(number).length();
        while(number > 0) {
            int lastDigit = number%10;
            sum += Math.pow(lastDigit, len);
            number = number/10;  // it takes log10(N) iterations
        }
        return sum == actualNumber ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(checkArmstrongNumber(n)) {
            System.out.println("Entered no. is armstrong number");
        } else {
            System.out.println("Entered no. is not an armstrong number");
        }
    }
}
