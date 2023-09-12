//program to reverse the number

import java.util.Scanner;

class ReverseNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int num = sc.nextInt();
		int reversedNumber=0;
		int num1 = num;
		while(num >0) {
			int temp = num%10;
			reversedNumber = reversedNumber*10 + temp;
			num = num/10;
		}
		System.out.println("Reversed Number:"+ reversedNumber);
		
		
	} 
}