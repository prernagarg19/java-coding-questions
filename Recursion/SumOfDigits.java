/*
	Sum of digits of positive number using Recursion
	Step 1 -  FlowLayout
			34  = 34/10 =3 and 34%10 = 4 => 3+4 = 7
			112 = 112/10 = 11 and 112%10 = 2
				  11/10 = 1 and 11 %10 =1  => 2+1+1 =4
				  
		f(n) = n%10 + f(n/10);
*/

import java.util.*;

class SumDigitsDemo {
	public int digitsSum(int n) {
		if(n ==0 || n < 0)
			return 0;
		//	return n;
		return (n%10) + digitsSum(n/10);
	}
}

public class SumOfDigits {
	public static void main(String[] args) {
		SumDigitsDemo sD = new SumDigitsDemo();
		System.out.print("Please enter the number to find the sum of its digits : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("The sum of digits of entered number is :" + sD.digitsSum(num));
		
	}
}