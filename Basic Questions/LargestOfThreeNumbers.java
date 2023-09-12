// Program to find Largest of three numbers - 2 Approaches

import java.util.Scanner;

class LargestOfThreeNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// ONE WAY
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		
		System.out.println(max);
		
		// OTHER WAY
		int max1 = Math.max(c, Math.max(a,b));
		System.out.println(max1);
	}
}