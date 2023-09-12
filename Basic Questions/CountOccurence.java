// program to count occurence of digit in a number

import java.util.Scanner;

class CountOccurence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		System.out.println("Enter the digit to search");
		int searchDigit = sc.nextInt();
		int count=0;
		while(num >0) {
			int temp = num%10;
			if(temp == searchDigit) {
				count++;
			}
			num = num/10;
		}
		
		System.out.println(count);
	}
}


 //switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("please enter a valid fruit");
//        }