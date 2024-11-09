import java.util.Scanner;

/*
 * returns true if the string passed to it is a palindrome (reads the same forward and backward). Otherwise it returns false.
 */
class PalindromeCheck {
    public boolean isPalindromeCheck(String str) {
        if(str.length() == 0 || str.length() == 1) 
            return true;
        if(str.charAt(0) == str.charAt(str.length()-1))
            return isPalindromeCheck(str.substring(1, str.length()-1));
        return false;
    }    
}

public class IsStringPalindrome {
    public static void main(String[] args) {
        PalindromeCheck pc = new PalindromeCheck();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(pc.isPalindromeCheck(str))
           System.out.println("Yes");
        else
            System.out.println("No");
       
    }
}
