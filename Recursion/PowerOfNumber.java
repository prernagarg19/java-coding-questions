/*
	Calculate power of a number using recursion.
	base^exp = base * base*.....till exp
	
*/

import java.util.*;

class PowerDemo {
	public int getPowerOfNumber(int n, int p) {
		if(p < 0) return -1;
		if(p==0 || p==1)
			return n;
		if(n == 0 )
			return 0;
		return n * getPowerOfNumber(n, p-1);
	}
}
class PowerOfNumber {
	public static void main(String[] args) {
		PowerDemo pDemo = new PowerDemo();
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		System.out.print("Enter the power : ");
		int exp = sc.nextInt();
		
		System.out.println(pDemo.getPowerOfNumber(base,exp));
	}
}