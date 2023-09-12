// Program to check the case of first letter of string - Alphabet case check

import java.util.Scanner;

class AlphabetCaseCheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().trim().charAt(0);	//next() - will accept the string until space - without space
												// trim() - it will remove extra whitespaces before and after the string
												// charAt() - to get the character at particular index of string
												
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("LowerCase");
		} else {
			System.out.println("UpperCase");
		}
		
	}
}