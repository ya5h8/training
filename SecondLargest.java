public class SecondLargest{
	public static void main(String[] args) {
		int[] arr = {223,45,231,445,665,32,4455,665};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int i = 0; i < arr.length; i++){
			if(arr[i] > largest){
				secondLargest = largest;
				largest = arr[i];
			}
		}
		System.out.println(secondLargest);
	}
}