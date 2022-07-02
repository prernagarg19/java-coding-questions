import java.util.*;

// Program to find Factorial using Recursion. Factorial number is the number which is multiplication of numnber with all the number less than it till 1
//  n! = n*(n-1)!
//0! = 1 and 1! = 1
class FactorialDemo {
	public int factorialResult(int n) {
		if(n < 0) {
			return -1;
		} else if(n == 0) {
			return 1;
		} else {
			return n * factorialResult(n-1);
		}
	}
}


class FactorialMain {
	public static void main(String args[]) {
		FactorialDemo fDemo = new FactorialDemo();
		Scanner sc = new Scanner(System.in);
		int fNum = sc.nextInt();
		System.out.println(fDemo.factorialResult(fNum));
		
	}
}



