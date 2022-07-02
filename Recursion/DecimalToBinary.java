/*
	Convert Decimal to Binary using Recursion
	f(n) = n mod 2 + 10 * f(n/2)
*/
import java.util.*;

class DecToBin {
	public int getBinaryRep(int n) {
		if(n == 0) return 0;
		return n%2 + 10 * getBinaryRep(n/2);
		
	}
}

class DecimalToBinary {
	public static void main(String[] args) {
		DecToBin db= new DecToBin();
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("The binary representation of "+num+ " is "+db.getBinaryRep(num));
	}
}