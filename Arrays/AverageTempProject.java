import java.util.*;

class AverageTempProject {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many day's temperature you want to enter? ");
		int n = sc.nextInt();
		int[] daysTempData = new int[n];
		int sum =0, count=0, avg;
		for(int i=0; i<n; i++) {
			System.out.println("Day "+ (i+1) + "'s temperature : ");
			daysTempData[i] = sc.nextInt();
			sum = sum+ daysTempData[i];
		}
		avg = sum/n;
		System.out.println("Average temperature is "+ avg);
		
		for(int i=0; i<n; i++) {
			if(daysTempData[i] > avg) {
				count++;
			}
		}
		System.out.println("No. of days above average temperature are "+ count);
		
	}
}