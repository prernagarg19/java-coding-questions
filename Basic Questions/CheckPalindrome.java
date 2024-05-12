import java.util.Scanner;

// TIME COMPLEXITY -> log10(N)+1
// SPACE COMPLEXITY -> O(1)
public class CheckPalindrome {
    public static boolean checkPalindrome(int number) {
        int reversedNumber = 0;
        boolean isPalindrome = false;
        int actualNumber = number;
        while (number > 0) {
            int lastDigit = number%10;
            reversedNumber = reversedNumber*10+lastDigit;
            number = number/10;
        }
        if(reversedNumber == actualNumber) {
            isPalindrome = true;
        }else {
            isPalindrome = false;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(checkPalindrome(n)) {
            System.out.println("Entered number is a Palindrome");
        }else {
            System.out.println("Entered number is not palindrome");
        }
    }
}
