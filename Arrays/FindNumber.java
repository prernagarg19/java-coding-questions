class FindNumber {
	public static void main(String[] args) {
		FindNumber fN = new FindNumber();
		int[] intArray = {1,2,3,4,5,6};
		int val=6;
		int res = fN.searchInArray(intArray, val);
		if(res != 0) {
			System.out.println("Value "+ val + " found at "+ res);
		} else {
			System.out.println("Value "+ val + " doesn't exist.");
		}
		
	}
	
	public int searchInArray(int[] intArray, int valueToSearch) {
		int t =0;
        for(int i=0; i<intArray.length; i++) {
            if(intArray[i] == valueToSearch) {
                t = i;
            }
        }
        return t;
	}
}