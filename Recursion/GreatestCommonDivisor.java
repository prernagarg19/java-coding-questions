/*
	Find the GCD or HCF of 2 numbers
	Euclidean Algorithm
	GCD(48,18) => Step 1: 48/18  = 2 and 48%18 = 12
				  Step 2: 18/12 = 1 and 18%12 = 6
				  Step 3: 12/6 = 2 and 12%6 = 2
	Euclidean ALgorithm  - gcd(a,0) = a   (if b=0 then gcd = a)
							gcd(a,b) = gcd(b, a mod b)
							
	Time Complexity: O(log(min(a,b))
	Auxiliary Space: O(log(min(a,b))
*/

import java.util.*;

class GcdDemo {
	public int getGCD(int a, int b) {
		if(a<0 || b<0) return -1;
		if(b == 0) return a;
		return getGCD(b, a%b);
	}
}

class GreatestCommonDivisor {
	public static void main(String[] args) {
		GcdDemo gcd = new GcdDemo();
		System.out.print("Enter first number : ");
		Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		
		System.out.println("The GCD of "+num1 +" and "+num2 +" is "+ gcd.getGCD(num1, num2));
	}
}