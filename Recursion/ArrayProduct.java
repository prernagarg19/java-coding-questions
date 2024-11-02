import java.util.Arrays;
import java.util.Scanner;

/*
 * Write a function called productOfArray which takes in an array of numbers and returns the product of them all.
 */
class ProductOfArray {
    public double resProduct(int[] arr, int n) {
        if(n <= 0)
            return 1;
        return arr[n-1] * resProduct(arr, n-1);
    }
}

public class ArrayProduct {
    public static void main(String[] args) {
        ProductOfArray pa = new ProductOfArray();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements you want to do the product");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements");
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        double productResult = pa.resProduct(arr, num);
        System.out.println("The product result is : "+ productResult);
    }
}
