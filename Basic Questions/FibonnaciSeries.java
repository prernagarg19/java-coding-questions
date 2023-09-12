// Program to find nth fibonnaci number

import java.util.Scanner;

class FibonnaciSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Enter nth number
		int n = sc.nextInt();
		int a =0, b=1;
		
		//DSA way
		int count=2;
		while(count <= n) {
			int temp =b;
			b = b+a;
			a = temp;
			count++;
		}
		System.out.println("Nth term: " +b);
		
	}
}


 // switch (day) {
            // case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            // case 6, 7 -> System.out.println("Weekend");
        // }