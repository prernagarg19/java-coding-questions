//Program to build Calculator App

import java.util.Scanner;

class CalculatorApp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//Take input till user doesn't press 'X' or 'x'
		int result =0;
		
		while(true) {
			System.out.println("Enter the operator");
			char op = sc.next().trim().charAt(0);	//to enter the operator
			if(op == '+' || op =='-' || op=='*' || op=='/' || op=='%') {
				System.out.println("Enter the numbers");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				if(op=='+') {
					result = num1+num2;
				}
				if(op=='-') {
					result = num1-num2;
				}
				if(op=='*') {
					result = num1*num2;
				}
				if(op=='/') {
					if(num2 != 0) {
						result = num1/num2;
					}
				}
				if(op =='%') {
					result = num1%num2;
				}
			}else if(op == 'X' || op =='x') {
				break;
			} else {
				System.out.println("Invalid Operation!");
			}
			System.out.println(result);
			
		}
		
		
	}
}