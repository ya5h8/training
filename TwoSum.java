class TwoSum{
	public static void main(String[] args) {
		int[] arr = { 1,23,4,5,66};
		int target = 24;
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j< arr.length; j++){
				
				if(arr[i] + arr[j] == target){
					System.out.println(arr[i]+ "," +arr[j]);
					
				}

			}
		}
	}
}