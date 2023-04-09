/*
 * Write a program to check if an array is unique or not.

	Example
	int[] intArray = {1,2,3,4,5,6};
	isUnique(intArray) // true
*/

class IsUniqueArray {
	public static void main(String[] args) {
		IsUniqueArray uqArr = new IsUniqueArray();
		int intArray[] = {1, 2, 3, 4, 5, 6, 8, 9, 10, 8};
		System.out.println(uqArr.isUnique(intArray));
	}
	
	public boolean isUnique(int[] intArray) {
      boolean isUnique = true;
      for(int i=0; i<intArray.length-1; i++) {   //intArray.length--?
          for(int j=i+1; j<intArray.length; j++) {
              if(intArray[i] == intArray[j]) {
                  isUnique = false;
              }
          }
      }
      return isUnique;
  }
}