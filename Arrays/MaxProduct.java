import java.util.*;

class MaxProduct {
	public static void main(String[] args) {
		MaxProduct mp = new MaxProduct();
		int[] intArray = {10,20,30,40,50};
//		int res = mp.maxProduct(intArray);
		String res = mp.maxProduct(intArray);
		System.out.println(res);
	}
	
//	public int maxProduct(Integer[] arr) {
//		 Arrays.sort(arr, Collections.reverseOrder());
//		 System.out.println(arr[0]+" , "+ arr[1]);
//	     return (int) arr[0]*arr[1];
//	}
	
	public String maxProduct(int[] arr) {
		int maxProduct = 0;
		String pairs = "";
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]*arr[j] > maxProduct) {
					maxProduct = arr[i]*arr[j];
					pairs = Integer.toString(arr[i]) + "," + Integer.toString(arr[j]);
				}
			}
		}
		return pairs;
	}
	
}