import java.util.Scanner;

public class CountDigits {

    //Brute Force Method
    //Time Complexity -> O(log10(N) + 1) because we are dividing number by 10 so log of base 10
    public static int countDigits(int number) {
        int count = 0;
        while(number > 0) {
            int lastDigit = number%10;
            number = number/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number - ");
        int n = sc.nextInt();
        int numberOfDigits = countDigits(n);
        System.out.println("The number of digits are - "+ numberOfDigits);
        //The number of digits can be calculated using log method
        //Optimal Approach
        int count = (int)(Math.log10(n)+1);
        System.out.println("Optimal : count is - "+ count);
    }
}
