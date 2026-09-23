class Largest{
	public static void main(String[] args) {
		int[] arr = {11,11,11,11,11,11};
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0; i< arr.length; i++){
			if(arr[i] > largest){
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}
}