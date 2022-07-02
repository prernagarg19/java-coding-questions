//Program to find fibonacci number (is the number which is the sum of preceding 2 numbers and the sequence starts from 0 and 1) using Recursion
// f(n) = f(n-1) + f(n-2)
// fibo of 0 is 0 and 1 is 1

import java.util.*;

class FiboDemo {
	public int fiboResult(int n) {
		int a =0, b=1;
		if(n < 0) {
			return -1;
		}
		if(n == 0 || n==1) {
			return n;
		}
		return fiboResult(n-1) + fiboResult(n-2);
	}
}

//Using Memoization - O(n)
class FibDemo {
protected HashMap<Integer, Integer> hm = new HashMap<> ();
	
	public int getFiboNum(int n) {
		if(n < 0) return -1;
		if(n==0 || n==1) return n;
		if(hm.containsKey(n)) {
			hm.get(n);
		}
		int res = getFiboNum(n-1) + getFiboNum(n-2);
		hm.put(n,res);
		return res;
	}
}
class FibonacciNumber {
	public static void main(String[] args){
	FiboDemo fDemo = new FiboDemo();
	System.out.println("Enter the number: ");
	Scanner sc = new Scanner(System.in);
	int fiboNum = sc.nextInt();
	
	System.out.println(fDemo.fiboResult(fiboNum));
	
	FibDemo fD = new FibDemo();
	System.out.println("Res: "+ fD.getFiboNum(fiboNum));
	
	}
}

//How to print series