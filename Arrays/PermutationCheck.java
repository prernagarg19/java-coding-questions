
/*
 * Your are given two integer arrays. Write a program to check if they are permutation of each other.

	Example	
	int[] array1 = {1,2,3,4,5};
	int[] array2 = {5,1,2,3,4};
	permutation(array1, array2)
	Output : true
*/
class PermutationCheck {
	public static void main(String[] args) {
		PermutationCheck pc = new PermutationCheck();
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {5,1,2,3,4};
		boolean res = pc.permutation(array1, array2);
		System.out.println(res);
	}
	
	public boolean permutation(int[] array1, int[] array2) {
		boolean isPermutation = false;
		int sum1=0, sum2=0, mul1=1, mul2=1;
		if(array1.length == array2.length) {
			for(int i=0; i<array1.length; i++) {
				sum1 += array1[i];
				mul1 *= array1[i];
				sum2 += array2[i];
				mul2 *= array2[i];
			}
			if(sum1 == sum2 && mul1 == mul2) {
				isPermutation = true;
			}
		}
		
		return isPermutation;
	}
	
//	public boolean permutation(int[] array1, int[] array2){
//        boolean isPermutation = false;
//        int sum1=0, sum2=0;
//        if(array1.length == array2.length) {
//            for(int i=0; i<array1.length; i++) {
//                sum1 += array1[i];
//                sum2 += array2[i];
//            }
//            if(sum1 == sum2) {
//                isPermutation = true;
//            }
//        }
//        return isPermutation;
//    }
}