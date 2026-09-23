import java.util.*;
class SubArraySum{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		int[] newarray = new int[20];
		int maxsum = 0;
		int currsum =0;

		for(int start = 0; start < arr.length; start++){
			currsum=0;
			for(int end = start; end < arr.length; end++){
				currsum = currsum+arr[end];
				maxsum = Math.max(currsum, maxsum);
			}
		}
		// int max = Arrays.stream(newarray).max().getAsInt();
		// System.out.println(max);
		System.out.println(maxsum);
	}
}